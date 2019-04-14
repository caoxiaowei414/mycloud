package com.xiaowei.eurekaprovider8001.controller.demo;
import com.xiaowei.eurekaprovider8001.entity.demo.MyDemo;
import com.xiaowei.eurekaprovider8001.service.demo.MyDemoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.xiaowei.common.utils.ResultVOUtil;
import com.xiaowei.common.vo.ResultVO;
import java.util.List;



/**
 *
 * Created by cxw on 2019/04/14.
 */
@RestController
@RequestMapping("/myDemo/")
public class MyDemoController {

    @Autowired
    MyDemoService myDemoService;

    @PostMapping("add")
    public ResultVO add(MyDemo myDemo) {
        myDemoService.save(myDemo);
        return ResultVOUtil.success();
    }

    @GetMapping("delete/{id}")
    public ResultVO delete(@PathVariable (name = "id") String id) {
	    myDemoService.deleteById(id);
        return ResultVOUtil.success();
    }

    @PostMapping("update")
    public ResultVO update(MyDemo myDemo) {
	    myDemoService.update(myDemo);
	    return ResultVOUtil.success();
    }

    @GetMapping("detail/{id}")
    public ResultVO detail(@PathVariable (name = "id") String id ) {
        MyDemo myDemo = myDemoService.findById(id);
        return ResultVOUtil.success(myDemo);
    }

    @PostMapping("list")
    public ResultVO list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MyDemo> list = myDemoService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultVOUtil.success(pageInfo);
    }
}
