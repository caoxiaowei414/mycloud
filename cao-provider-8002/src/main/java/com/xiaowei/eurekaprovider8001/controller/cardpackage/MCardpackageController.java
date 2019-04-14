package com.xiaowei.eurekaprovider8001.controller.cardpackage;
import com.xiaowei.eurekaprovider8001.entity.cardpackage.MCardpackage;
import com.xiaowei.eurekaprovider8001.service.cardpackage.MCardpackageService;
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
@RequestMapping("/mCardpackage/")
public class MCardpackageController {

    @Autowired
    MCardpackageService mCardpackageService;

    @PostMapping("add")
    public ResultVO add(MCardpackage mCardpackage) {
        mCardpackageService.save(mCardpackage);
        return ResultVOUtil.success();
    }

    @GetMapping("delete/{id}")
    public ResultVO delete(@PathVariable (name = "id") String id) {
	    mCardpackageService.deleteById(id);
        return ResultVOUtil.success();
    }

    @PostMapping("update")
    public ResultVO update(MCardpackage mCardpackage) {
	    mCardpackageService.update(mCardpackage);
	    return ResultVOUtil.success();
    }

    @GetMapping("detail/{id}")
    public ResultVO detail(@PathVariable (name = "id") String id ) {
        MCardpackage mCardpackage = mCardpackageService.findById(id);
        return ResultVOUtil.success(mCardpackage);
    }

    @PostMapping("list")
    public ResultVO list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MCardpackage> list = mCardpackageService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultVOUtil.success(pageInfo);
    }
}
