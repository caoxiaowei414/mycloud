package ${basePackage}.controller.${sign};
import ${basePackage}.entity.${sign}.${modelNameUpperCamel};
import ${basePackage}.service.${sign}.${modelNameUpperCamel}Service;
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
 * Created by ${author} on ${date}.
 */
@RestController
@RequestMapping("/${baseRequestMapping}/")
public class ${modelNameUpperCamel}Controller {

    @Autowired
    ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;

    @PostMapping("add")
    public ResultVO add(${modelNameUpperCamel} ${modelNameLowerCamel}) {
        ${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
        return ResultVOUtil.success();
    }

    @GetMapping("delete/{id}")
    public ResultVO delete(@PathVariable (name = "id") String id) {
	    ${modelNameLowerCamel}Service.deleteById(id);
        return ResultVOUtil.success();
    }

    @PostMapping("update")
    public ResultVO update(${modelNameUpperCamel} ${modelNameLowerCamel}) {
	    ${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
	    return ResultVOUtil.success();
    }

    @GetMapping("detail/{id}")
    public ResultVO detail(@PathVariable (name = "id") String id ) {
        ${modelNameUpperCamel} ${modelNameLowerCamel} = ${modelNameLowerCamel}Service.findById(id);
        return ResultVOUtil.success(${modelNameLowerCamel});
    }

    @PostMapping("list")
    public ResultVO list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultVOUtil.success(pageInfo);
    }
}
