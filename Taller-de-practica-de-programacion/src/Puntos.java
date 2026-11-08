import java.util.Scanner;

public class Puntos {

    void punto1() {
        System.out.printf("hola mundo");
    }

    void punto2() {
        String nombre = "Carlos";
        System.out.println("Hola " + nombre);
    }

    void punto3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        double numero = scanner.nextDouble();
        double cuadrado = numero * numero;
        System.out.println("El cuadrado del numero es: " + cuadrado);
        scanner.close();
    }

    void punto4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cálculo de Promedio Ponderado ---");
        System.out.print("Ingrese la nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese la nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese la nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Ingrese la nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Ingrese la nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double promedioFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("El promedio ponderado es: " + promedioFinal);
        scanner.close();
    }

    void punto5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = scanner.nextDouble();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        if (b != 0) {
            System.out.println("División: " + (a / b));
            System.out.println("Residuo (Módulo): " + (a % b));
        } else {
            System.out.println("División y residuo: No se puede dividir entre cero.");
        }
        scanner.close();
    }

    void punto6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();

        int parteEntera = (int) numero;
        double parteDecimal = numero - parteEntera;

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
        scanner.close();
    }

    void punto7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Ingrese nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Ingrese nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("La nota final es: " + notaFinal);
        scanner.close();
    }

    double calcularPromedio(double n1, double n2, double n3, double n4, double n5) {
        return n1 * 0.15 + n2 * 0.20 + n3 * 0.15 + n4 * 0.30 + n5 * 0.20;
    }

    void punto8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el precio bruto (valor original): ");
        double precioBruto = scanner.nextDouble();

        double precioConIVA = calcularIVA(precioBruto);
        double valorIVA = precioConIVA - precioBruto;

        System.out.println("Precio bruto: " + precioBruto);
        System.out.println("Valor del IVA (19%): " + valorIVA);
        System.out.println("Precio con IVA incluido: " + precioConIVA);
        scanner.close();
    }

    double calcularIVA(double precioBruto) {
        return precioBruto * 1.19;
    }

    void punto9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        scanner.close();
    }

    void punto10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del hexágono: ");
        double lado = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
        System.out.println("El área del hexágono es: " + area);
        scanner.close();
    }

    void punto11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números desea ingresar?: ");
        int n = scanner.nextInt();

        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            suma += scanner.nextDouble();
        }

        if (n > 0) {
            double promedio = suma / n;
            System.out.println("El promedio de los " + n + " números es: " + promedio);
        } else {
            System.out.println("Cantidad de números no válida.");
        }
        scanner.close();
    }

    void punto12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("La distancia entre los puntos es: " + distancia);
        scanner.close();
    }

    void punto13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un dígito n (1 al 9): ");
        int n = scanner.nextInt();

        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        int suma = n + nn + nnn;

        System.out.println("Valores generados: " + n + ", " + nn + ", " + nnn);
        System.out.println("La suma de ellos es: " + suma);
        scanner.close();
    }

    void punto14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de segundos (ej. 86399): ");
        int totalSegundos = scanner.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf("Resultado --> %02d:%02d:%02d\n", horas, minutos, segundos);
        scanner.close();
    }

    void punto15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        scanner.close();
    }

    void punto16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
        scanner.close();
    }

    void punto17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la venta: ");
        double venta = scanner.nextDouble();
        double precioConIva = calcularIVA(venta);
        if (venta > 150000) {
            precioConIva = precioConIva * 0.95;
        }
        System.out.println("Precio final: " + precioConIva);
        scanner.close();
    }

    void punto18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nota 1 (15%): ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese nota 2 (20%): ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese nota 3 (15%): ");
        double n3 = scanner.nextDouble();
        System.out.print("Ingrese nota 4 (30%): ");
        double n4 = scanner.nextDouble();
        System.out.print("Ingrese nota 5 (20%): ");
        double n5 = scanner.nextDouble();

        double notaFinal = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("Nota final: " + notaFinal);

        if (notaFinal < 2.0) {
            System.out.println("No puede habilitar");
        } else if (notaFinal < 3.0) {
            System.out.println("Reprobó");
        } else {
            System.out.println("Aprobó");
            if (notaFinal > 4.5) {
                System.out.println("¡Felicitaciones!");
            }
        }
        scanner.close();
    }

    void punto19() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese c: ");
        double c = scanner.nextDouble();

        double discriminante = (b * b) - (4 * a * c);
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("No tiene soluciones reales");
        }
        scanner.close();
    }

    void punto20() {
        Scanner scanner = new Scanner(System.in);
        String userPred = "carlos";
        String passPred = "1234";

        System.out.print("Ingrese usuario: ");
        String usuario = scanner.next();
        System.out.print("Ingrese contraseña: ");
        String password = scanner.next();

        if (usuario.equals(userPred) && password.equals(passPred)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Usuario o contraseña incorrectos");
        }
        scanner.close();
    }

    void punto21() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entre 0 y 10: ");
        int n = scanner.nextInt();
        switch (n) {
            case 0: System.out.println("CERO"); break;
            case 1: System.out.println("UNO"); break;
            case 2: System.out.println("DOS"); break;
            case 3: System.out.println("TRES"); break;
            case 4: System.out.println("CUATRO"); break;
            case 5: System.out.println("CINCO"); break;
            case 6: System.out.println("SEIS"); break;
            case 7: System.out.println("SIETE"); break;
            case 8: System.out.println("OCHO"); break;
            case 9: System.out.println("NUEVE"); break;
            case 10: System.out.println("DIEZ"); break;
            default: System.out.println("Número fuera de rango");
        }
        scanner.close();
    }

    void punto22() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número menor a 100.000: ");
        int num = scanner.nextInt();
        String s = String.valueOf(Math.abs(num));
        System.out.println("Tiene " + s.length() + " dígitos");
        scanner.close();
    }

    void punto23() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese número 2: ");
        int n2 = scanner.nextInt();
        System.out.print("Ingrese número 3: ");
        int n3 = scanner.nextInt();

        if (n1 < n2 && n2 < n3) {
            System.out.println("Está incrementando");
        } else if (n1 > n2 && n2 > n3) {
            System.out.println("Está disminuyendo");
        } else {
            System.out.println("Ni se incrementa ni se disminuye");
        }
        scanner.close();
    }

    void punto24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();
        boolean esPali = esPalindromo(palabra);
        System.out.println("¿Es palíndromo?: " + esPali);
        scanner.close();
    }

    void punto25() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        String invertido = invertirTexto(texto);
        System.out.println("Texto invertido: " + invertido);
        scanner.close();
    }

    String invertirTexto(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    void punto26() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        String[] palabras = texto.split(" ");
        StringBuilder resultado = new StringBuilder();
        for (String p : palabras) {
            if (!p.isEmpty()) {
                resultado.append(Character.toUpperCase(p.charAt(0)))
                        .append(p.substring(1)).append(" ");
            }
        }
        System.out.println(resultado.toString().trim());
        scanner.close();
    }

    void punto27() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto largo: ");
        String texto = scanner.nextLine().trim();
        String[] palabras = texto.split("\\s+");
        if (palabras.length >= 2) {
            System.out.println("Penúltima palabra: " + palabras[palabras.length - 2]);
        } else {
            System.out.println("No hay suficientes palabras.");
        }
        scanner.close();
    }

    void punto28() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer texto: ");
        String t1 = scanner.nextLine();
        System.out.print("Ingrese el segundo texto: ");
        String t2 = scanner.nextLine();
        if (t2.contains(t1)) {
            System.out.println("El segundo texto SÍ contiene el primero.");
        } else {
            System.out.println("El segundo texto NO contiene el primero.");
        }
        scanner.close();
    }

    void punto29() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();
        boolean esPali = esPalindromo(palabra);
        System.out.println("¿Es palíndromo?: " + esPali);
        scanner.close();
    }

    boolean esPalindromo(String palabra) {
        String limpio = palabra.replaceAll("\\s+", "").toLowerCase();
        String alReves = new StringBuilder(limpio).reverse().toString();
        return limpio.equals(alReves);
    }

    void punto30() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de lados del polígono regular: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese la longitud del lado: ");
        double lado = scanner.nextDouble();
        System.out.print("Ingrese la apotema: ");
        double apotema = scanner.nextDouble();
        double perimetro = n * lado;
        double area = (perimetro * apotema) / 2;
        System.out.println("El área del polígono es: " + area);
        scanner.close();
    }

    void punto31() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void punto32() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void punto33() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    void punto34() {
        Scanner scanner = new Scanner(System.in);
        int num = -1;
        while (num <= 0) {
            System.out.print("Ingrese un número entero positivo: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num <= 0) {
                    System.out.println("Valor no permitido. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
        }
        System.out.println("Valor válido ingresado: " + num);
        scanner.close();
    }

    void punto35() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal (entero): ");
        int decimal = scanner.nextInt();
        String binario = Integer.toBinaryString(decimal);
        System.out.println("En binario: " + binario);
        scanner.close();
    }

    void punto36() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número binario: ");
        String binario = scanner.next();
        try {
            int decimal = Integer.parseInt(binario, 2);
            System.out.println("En decimal: " + decimal);
        } catch (NumberFormatException e) {
            System.out.println("Número binario no válido.");
        }
        scanner.close();
    }

    void punto37() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void punto38() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        scanner.close();
    }

    void punto39() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

