import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
import spark.ModelAndView;
import java.util.HashMap;
import java.util.Map;


public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

    }
}