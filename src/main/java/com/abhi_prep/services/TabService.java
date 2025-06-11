package com.abhi_prep.services;

import com.abhi_prep.entities.Tab;
import org.springframework.stereotype.Service;
import java.util.LinkedList;
import java.util.Optional;

@Service
public class TabService {

    private LinkedList<Tab> tabs = new LinkedList<>();
    private Tab currentTab;

    public TabService() {
        // Initialize with a default tab
        openNewTab("Default Tab");
    }

    // Open a new tab
    public Tab openNewTab(String title) {
        Tab newTab = new Tab(title, tabs.size() + 1);
        tabs.add(newTab);
        currentTab = newTab;
        return newTab;
    }

    // Close an existing tab by ID
    public boolean closeTab(int id) {
        Optional<Tab> tabToClose = tabs.stream().filter(tab -> tab.getId() == id).findFirst();
        if (tabToClose.isPresent()) {
            tabs.remove(tabToClose.get());
            if (currentTab.equals(tabToClose.get())) {
                currentTab = tabs.isEmpty() ? null : tabs.getLast();
            }
            return true;
        }
        return false;
    }

    // Switch to a different tab
    public Tab switchTab(int id) {
        Optional<Tab> tabToSwitch = tabs.stream().filter(tab -> tab.getId() == id).findFirst();
        tabToSwitch.ifPresent(tab -> currentTab = tab);
        return currentTab;
    }

    // Get all tabs
    public LinkedList<Tab> getTabs() {
        return tabs;
    }

    public Tab getCurrentTab() {
        return currentTab;
    }
}



