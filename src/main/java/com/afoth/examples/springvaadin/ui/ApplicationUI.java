package com.afoth.examples.springvaadin.ui;

import com.afoth.examples.springvaadin.domain.Item;
import com.vaadin.annotations.Push;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.spring.annotation.VaadinSessionScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@SpringUI(path = "/")
@Push(PushMode.DISABLED)
public class ApplicationUI extends UI {
    private static final long serialVersionUID = 7093820577565449335L;

    //    @Autowired
//    ItemRepository repository;

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();
        setContent(layout);

        Grid<Item> grid = new Grid<>("Items");
        grid.addColumn(Item::getId).setCaption("Item ID");

        Button createItemButton = new Button("Create Item", new CreateItemListener());

        layout.addComponent(grid);
        layout.addComponent(createItemButton);
//        layout.addComponent(new Button("Logout", new Button.ClickListener() {
//            @Override
//            public void buttonClick(Button.ClickEvent event) {
//                VaadinSession.getCurrent().close();
//            }
//        }));
        update();
        System.gc();
    }

    private void update() {
//        grid.setItems(repository.findAll());
    }
}
