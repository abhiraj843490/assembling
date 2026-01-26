package com.assembling.controller;

import com.assembling.entities.Tab;
import com.assembling.services.TabService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;

@ExtendWith(MockitoExtension.class)
class TabControllerTest {
    @InjectMocks
    private TabController tabController;
    @Mock
    private TabService tabService;
    private Tab tab;
    @BeforeEach
    public void setUp(){
        tab = new Tab("hond", 1);
    }
    @Test
    public void getAllTabsTest(){
        LinkedList<Tab> linkedList = new LinkedList<>();
        linkedList.add(tab);
        Mockito.when(tabService.getTabs()).thenReturn(linkedList);
        LinkedList<Tab> tabs = tabController.getAllTabs();
        Assertions.assertNotNull(tabs);
    }

    @Test
    public void openTabTest(){
        String title = "open";
        Mockito.when(tabService.openNewTab(title)).thenReturn(tab);
        Tab tab1 = tabController.openTab(title);
        Assertions.assertNotNull(tab1);
    }
    @Test
    public void switchTabTest(){
        int id = 123;
        Mockito.when(tabService.switchTab(id)).thenReturn(tab);
        Tab tab1 = tabController.switchTab(id);
        Assertions.assertNotNull(tab1);
    }

    @Test
    public void closeTab(){
        int id = 483;
        Mockito.when(tabService.closeTab(id)).thenReturn(true);


    }



}