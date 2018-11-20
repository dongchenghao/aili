package com.mycompany.controller;

import com.mycompany.entity.TestEntity;
import com.mycompany.service.TestService;
import org.hswebframework.web.commons.entity.param.QueryParamEntity;
import org.hswebframework.web.controller.SimpleGenericEntityController;
import org.hswebframework.web.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class TestController implements SimpleGenericEntityController<TestEntity,String,QueryParamEntity>{

    @Autowired
    TestService testService;

    @Override
    public CrudService<TestEntity, String> getService() {
        return testService;
    }

    @PutMapping()
    public void update(@RequestBody  TestEntity testEntity){
        testService.saveOrUpdate(testEntity);
    }

    @PostMapping()
    public void save(@RequestBody TestEntity testEntity){
        testService.saveOrUpdate(testEntity);
    }

    @DeleteMapping()
    public void delete(@RequestParam  String id){
        testService.deleteByPk(id);
    }
}
