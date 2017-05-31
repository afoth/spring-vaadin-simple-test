package com.afoth.examples.springvaadin.ui;

import com.vaadin.ui.Button;

public class CreateItemListener implements Button.ClickListener {
    private static final long serialVersionUID = -734462410186866113L;

    @Override
    public void buttonClick(Button.ClickEvent event) {
        System.out.println("Item created");
    }
}
