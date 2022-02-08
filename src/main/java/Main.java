import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {

    public static void main(String[] args) {

      Javalin app = Javalin.create().start(4100);
        
      app.get("/", ctx -> ctx.render("index.jte"));


    }

  
}
