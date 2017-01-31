package chorazy.views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import javax.annotation.PostConstruct;

@SpringView(name = "NewGame")
public class NewGame extends VerticalLayout implements View {

    @PostConstruct
    protected void init() {
        addComponent(new Label("This is NewGame"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
