package com.neusoft.zywlzl.controller;

import com.neusoft.zywlzl.model.CnMedInfo;
import com.neusoft.zywlzl.model.CnMedInfoCategory;
import com.neusoft.zywlzl.service.CnMedInfoCategoryService;
import com.neusoft.zywlzl.service.CnMedInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CnMedInfoCategoryController {

    @PostMapping("/cnmedinfocate/searchall")
    public List<CnMedInfoCategory> searchAll() {
        CnMedInfoCategoryService cnMedInfoCategoryService = new CnMedInfoCategoryService();
        return cnMedInfoCategoryService.selectAll();
    }

    @PostMapping("/cnmedinfocate/insert")
    public int insert(CnMedInfoCategory cnMedInfoCategory) {
        CnMedInfoCategoryService cnMedInfoCategoryService = new CnMedInfoCategoryService();
        return cnMedInfoCategoryService.insert(cnMedInfoCategory);
    }

    @PostMapping("/cnmedinfocate/delete")
    public int delete(int id) {
        CnMedInfoCategoryService cnMedInfoCategoryService = new CnMedInfoCategoryService();
        return cnMedInfoCategoryService.deleteByPrimaryKey(id);
    }

    @PostMapping("/cnmedinfocate/update")
    public int update(CnMedInfoCategory cnMedInfoCategory) {
        CnMedInfoCategoryService cnMedInfoCategoryService = new CnMedInfoCategoryService();
        return cnMedInfoCategoryService.updateByPrimaryKey(cnMedInfoCategory);
    }
}
