import iterator.BrowseHistory;
import state.exercise.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//
//        User user =
//                new User ("Moses", 30);
//            user.sayHello();

//        TaxCalculator calculator = getCalculator();
//
//        calculator.calculateTax();
//
//        var account = new Account();
//        account.deposit(10);
//        account.withdraw(5);
//        System.out.println( account.getBalance());
//
//        var mailService = new MailService();
//var textBox = new TextBox();
//textBox.enable();
//
        // Memento Lecture
//drawUIControl(new TextBox());
//        drawUIControl(new CheckBox());
//
//    var editor = new Editor();
//    var history = new History();
//
//
//    editor.setContent("a");
//    history.push(editor.createState());
//
//
//        editor.setContent("b");
//        history.push(editor.createState());
//        editor.setContent("c");
//        history.push(editor.createState());
//        editor.setContent("d");
//        editor.restore(history.pop());
//        editor.restore(history.pop());
//        System.out.println(editor.getContent());

//        // Memento Exercise
//        var doc = new Document();
//        var docHistory = new DocHistory();
//
//        doc.setContent("a");
//        doc.setFontName("f");
//        doc.setFontSize(1);
//        docHistory.push(doc.createState());
//
//        doc.setContent("b");
//        doc.setFontName("g");
//        doc.setFontSize(2);
//        docHistory.push(doc.createState());
//
//        doc.setContent("c");
//        doc.setFontName("h");
//        doc.setFontSize(3);
//        docHistory.push(doc.createState());
//
//        doc.setContent("d");
//        doc.setFontName("i");
//        doc.setFontSize(4);
//
//        doc.restore(docHistory.pop());
//
//
//
//        System.out.println(doc.getContent());
//        System.out.println(doc.getFontName());
//        System.out.println(doc.getFontSize());
//
//    // State Lecture
//        var canvas = new Canvas();
//
//        // handle the selection tool
//        canvas.setCurrentTool(new SelectionTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        // handle the brush tool
//        canvas.setCurrentTool(new BrushTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        // handle the eraser tool, just by adding an Eraser class, this would be achieved
//        canvas.setCurrentTool(new EraserTool());
//        canvas.mouseDown();
//        canvas.mouseUp();
//        // abuse of state pattern
//        var stopWatch = new Stopwatch();
//        stopWatch.click();
//        stopWatch.click();
//        stopWatch.click();

//            // State Exercise
//        var ds = new DirectionService();
//
//        // handle get eta for driving
//        ds.setCalculate(new Driving());
//        ds.getEta();
//        // handle get direction for driving
//        ds.getDirection();
//
//        // handle get eta for Bicycling
//        ds.setCalculate(new Bicycling());
//        ds.getEta();
//        // handle get direction for Bicycling
//        ds.getDirection();
//
//        // handle get eta for Transit
//        ds.setCalculate(new Transit());
//        ds.getEta();
//        // handle get direction for Bicycling
//        ds.getDirection();
//
//        // handle get eta for Walking
//        ds.setCalculate(new Walking());
//        ds.getEta();
//        // handle get direction for Bicycling
//        ds.getDirection();

        // iterator pattern
        var history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");
        history.push("d");

        for (int i = 0; i < history.getUrls().size(); i++) {
            var url =  history.getUrls().get(i);
            System.out.println(url);
        }

    }

public static void drawUIControl(UIControl control){
        control.draw();

}

    public static TaxCalculator getCalculator(){
        return new TaxCalculator2023();
    }
}