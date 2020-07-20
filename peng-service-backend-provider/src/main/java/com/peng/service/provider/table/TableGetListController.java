package com.peng.service.provider.table;

import com.peng.domain.result.ResponseResult;
import com.peng.domain.table.test.TestDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Zhaofengtao
 * @Date 2020/7/20 11:56
 * @Version 1.0
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/table",method = RequestMethod.GET)
public class TableGetListController {

    @GetMapping(value = "/list")
    @ResponseBody
    public ResponseResult<Map<String,Object>> list(){
        TestDto data = new TestDto();
        List<TestDto> items = new ArrayList<>();
        for (int i=0;i<10;i++){
            items.add(data);
        }
        Map<String,Object> result = new HashMap<>();
        result.put("items",items);
        return new ResponseResult<>(20000,"success!",result);
    }
}
