package menu_alumnos;

import java.io.IOException;
import java.util.*;

import com.Utils;

public class Menu_Robert {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;

		try {
			do {
				mostrarMenu();
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					infoSistema();
					break;
				case 2:
					hostDetalles();
					break;
				case 3:
					infoCpu();
					break;
				case 4:
					horaSistema();
					break;
				case 5:
					System.out.println("PROGRAMA FINALIZADO :)");
					break;
				default:
					System.err.println("ERROR. Opción incorrecta.");
				}

			} while (opcion != 5);

		} catch (Exception e) {
			System.err.println(e.toString());
		}

	}

	public static void mostrarMenu() {
		System.out.println("\n==== MENÚ DEL SISTEMA ====");
		System.out.println("--ELIGE UNA OPCIÓN---");
		System.out.println("1. Información del sistema. (uname -a)");
		System.out.println("2. Muestra el nombre del host y detalles relacionados. (hostnamectl)");
		System.out.println("3. Lista la información de la arquitectura de la CPU. (lscpu) ");
		System.out.println("4. Muestra la hora del sistema. (timedatectl status)");
		System.out.println("5. Finalizar programa. \n");
	}

	public static void infoSistema() throws InterruptedException, IOException {
		new ProcessBuilder(Utils.sh("uname -a")).inheritIO().start().waitFor();
	}

	public static void hostDetalles() throws InterruptedException, IOException {
		new ProcessBuilder(Utils.sh("hostnamectl")).inheritIO().start().waitFor();
	}

	public static void infoCpu() throws InterruptedException, IOException {
		new ProcessBuilder(Utils.sh("lscpu")).inheritIO().start().waitFor();
	}

	public static void horaSistema() throws InterruptedException, IOException {
		new ProcessBuilder(Utils.sh("timedatectl status")).inheritIO().start().waitFor();
	}

}