package com.neusoft.zywlzl.controller;

import com.neusoft.zywlzl.model.CnMedInfo;
import com.neusoft.zywlzl.service.CnMedInfoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CnMedInfoController {

    @PostMapping("/cnmedinfo/searchall")
    public List<CnMedInfo> searchAll() {
        CnMedInfoService cnMedInfoService = new CnMedInfoService();
        return cnMedInfoService.selectAll();
    }

    @PostMapping("/cnmedinfo/searchbytitle")
    public List<CnMedInfo> searchByKeyword(String keyword) {
        CnMedInfoService cnMedInfoService = new CnMedInfoService();
        return cnMedInfoService.selectByKeyword(keyword);
    }

    @PostMapping("/cnmedinfo/insert")
    public int insert(CnMedInfo cnMedInfo) {
        CnMedInfoService cnMedInfoService = new CnMedInfoService();
        return cnMedInfoService.insert(cnMedInfo);
    }

    @PostMapping("/cnmedinfo/delete")
    public int delete(int id) {
        CnMedInfoService cnMedInfoService = new CnMedInfoService();
        return cnMedInfoService.deleteByPrimaryKey(id);
    }

    @PostMapping("/cnmedinfo/update")
    public int update(CnMedInfo cnMedInfo) {
        CnMedInfoService cnMedInfoService = new CnMedInfoService();
        return cnMedInfoService.updateByPrimaryKey(cnMedInfo);
    }
}
