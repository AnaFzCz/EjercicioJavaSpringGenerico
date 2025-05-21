package br.alura.alura.ejercicioJavaSpringGenerico;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

@SpringBootApplication
public class EjercicioJavaSpringGenericoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EjercicioJavaSpringGenericoApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {


        System.out.println("Ejercicio 1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el número que deseas que contar: ");
        int num = scanner.nextInt();
        int cont = 0;

        while (cont < num) {

            cont++;
            System.out.println("Número: " + cont + " ");
        }

        System.out.println("*****************************************************");

        System.out.println("Ejercicio 2");

        System.out.println("Pregunta:\n\n Suponha que decidimos mudar de ideia e utilizar novamente a biblioteca \nGson no nosso projeto ScreenMatch. Agora que estamos trabalhando com o Maven, os passos para adicionar a biblioteca\n são diferentes do que já foi feito antes. Explique quais passos você iria realizar nesse caso.");
        System.out.println("Respuesta: \n\n En el supuesto caso que lleguemos a trabajar nuevamente con la \n biblioteca Gson, debemos proceder a adquirir desde la página Maven Repository la dependencia correspondiente, en mi caso sería: ");
        System.out.println("<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->\n" +
                "<dependency>\n" +
                "    <groupId>com.google.code.gson</groupId>\n" +
                "    <artifactId>gson</artifactId>\n" +
                "    <version>2.13.1</version>\n" +
                "</dependency>");
        System.out.println("en el archivo pom.xml");

        System.out.println("*****************************************************");

        System.out.println("Ejercicio 4");
        System.out.println("Serialización");
        Tarefa tarefa = new Tarefa();
        tarefa.setDescripcion("Mantenimiento de pagina de lectura");
        tarefa.setConcluida(true);
        tarefa.setPersonaResponsable("Lois Laine");
// Use ToString
        FileWriter impreso = new FileWriter("tarefa.json");
        impreso.write(tarefa.toString());
        impreso.close();
        System.out.println("Archivo Generado");
// Use ObjectMapper
        System.out.println("*****************************************************");
        System.out.println("Ejercicio 5");
        System.out.println("Deserialización");


        ObjectMapper objectMapper = new ObjectMapper();
        //serialización

        ObjectWriter escribe = objectMapper.writerWithDefaultPrettyPrinter();
        escribe.writeValue(new File("TareaObjetWrite.json"), tarefa);

        //deserialización
        Tarefa tarea = objectMapper.readValue(new File("TareaObjetWrite.json"), Tarefa.class);
        System.out.println("Tarea leída desde JSON:");
        System.out.println(tarea);


    }
}
