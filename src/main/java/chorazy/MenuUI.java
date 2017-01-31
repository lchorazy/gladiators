package chorazy;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.navigator.SpringViewProvider;
import com.vaadin.ui.MenuBar;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;


@SpringUI
@Theme("valo")
public class MenuUI extends UI {

    private Panel springViewDisplay;

    @Autowired
    private
    SpringViewProvider viewProvider;

    @Override
    protected void init(VaadinRequest request) {
        VerticalLayout layout = new VerticalLayout();

        MenuBar menuBar = new MenuBar();

        Panel viewContent = new Panel();

        layout.addComponents(menuBar, viewContent);

        layout.setSizeFull();
        layout.setExpandRatio(viewContent, 1);


        Navigator navigator = new Navigator(this, viewContent);
        navigator.addProvider(viewProvider);
        menuBar.addItem("Dashboard", e -> navigator.navigateTo("Dashboard"));
        menuBar.addItem("NewGame", e -> navigator.navigateTo("NewGame"));
        setContent(layout);

        navigator.navigateTo("Dashboard");
    }
}