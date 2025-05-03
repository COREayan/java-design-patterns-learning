package prateekNarang.Problem;

// Windows UI Componenets
class WindowsButton {
    public void render() {
        System.out.println("Rendering windows button");
    }
}

class WindowsScrollBar {
    public void scroll() {
        System.out.println("Scrolling windows scrollbar");
    }
}

class MacOSButton {
    public void render() {
        System.out.println("Rendering MacOS button");
    }
}

class MacOSScrollBar {
    public void scroll() {
        System.out.println("Scrolling MacOS scrollbar");
    }
}


public class Application {
    public static void main(String[] args) {
        // Windows UI
        WindowsButton button = new WindowsButton();
        WindowsScrollBar scrollBar = new WindowsScrollBar();

        button.render();
        scrollBar.scroll();

        // Mac UI

    }
}
