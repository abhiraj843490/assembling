package com.abhi_prep.controller;
import com.abhi_prep.entities.Tab;
import com.abhi_prep.services.TabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
@RequestMapping("/api/tabs")
public class TabController {

    @Autowired
    private TabService tabService;

    @GetMapping
    public LinkedList<Tab> getAllTabs() {
        return tabService.getTabs();
    }

    @PostMapping("/open")
    public Tab openTab(@RequestParam String title) {
        return tabService.openNewTab(title);
    }

    @PostMapping("/switch")
    public Tab switchTab(@RequestParam int id) {
        return tabService.switchTab(id);
    }

    @DeleteMapping("/close/{id}")
    public boolean closeTab(@PathVariable int id) {
        return tabService.closeTab(id);
    }

    @GetMapping("/current")
    public Tab getCurrentTab() {
        return tabService.getCurrentTab();
    }
}

