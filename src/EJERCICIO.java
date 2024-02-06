import java.util.Scanner;

public class EJERCICIO {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int opcion = 0, opcion1 = 0, opcion2 = 0;
		
		System.out.println("---BIENVENIDO---");	
		
		do {
		
		System.out.println("Elija cual ejercicio quiere hacer");	
		System.out.println("|1| Ejercicio secuenciales");
		System.out.println("|2| Ejercicio de decisiones");
		System.out.println("|0| salir");
		opcion = leer.nextInt();
		System.out.println();
		
		switch(opcion) {
		
		   case 0:
			   
			   System.out.println("Saliendo del programa....");
			   System.out.println();
			   
			   break;
		
			   //EJERCICIO SECUENCIAL
			   
		   case 1:
			   
			   do {
				   
				    System.out.println("Elija cual ejercicio secuencial quiere hacer");
				    System.out.println();
					System.out.println("|1| Ejercicio");
					System.out.println("|3| Ejercicio");
					System.out.println("|5| Ejercicio");
					System.out.println("|7| Ejercicio");
					System.out.println("|9| Ejercicio");
					System.out.println("|11| Ejercicio");
					System.out.println("|13| Ejercicio");
					System.out.println("|15| Ejercicio");
					System.out.println("|17| Ejercicio");
					System.out.println("|19| Ejercicio");
					System.out.println("|21| Ejercicio");
					System.out.println("|0| salir");
					opcion1 = leer.nextInt();
					System.out.println();
					
					switch(opcion1) {
					
					case 0:
						
						break;
					
					case 1:
						
						ejercicio1();
						
						break;
						
					case 3:
						
						ejercicio3();
						
						break;
						
					case 5:
						
						ejercicio5();
						
						break;
						
					case 7:
						
						ejercicio7();
						
						break;
						
					case 9:
						
						ejercicio9();
						
						break;
						
					case 11:
						
						ejercicio11();
						
						break;
						
					case 13:
						
						ejercicio13();
						
						break;
						
					case 15:
						
						ejercicio15();
						
						break;
						
					case 17:
						
						ejercicio17();
						
						break;
						
					case 19:
						
						ejercicio19();
						
						break;
						
					case 21:
						
						ejercicio21();
						
						break;
						
				    default:
				    	
				    	System.out.println("Porfavor elija una opcion correcta");
				    	System.out.println();
				    	
				    	break;
					
					}
				   
			   } while (opcion1 != 0);
			   
			   System.out.println("Saliendo de los ejercicios secuenciales......");
			   System.out.println();
			   
			break;
			
			//EJERCICIO SECUENCIAL
			
			//EJERCICIO DE DECISIONES
			
		   case 2:
			   
			   do {
				   
				    System.out.println("Elija cual ejercicio decisional quiere hacer");
				    System.out.println();
					System.out.println("|25| Ejercicio");
					System.out.println("|27| Ejercicio");
					System.out.println("|29| Ejercicio");
					System.out.println("|31| Ejercicio");
					System.out.println("|33| Ejercicio");
					System.out.println("|35| Ejercicio");
					System.out.println("|37| Ejercicio");
					System.out.println("|39| Ejercicio");
					System.out.println("|41| Ejercicio");
					System.out.println("|43| Ejercicio");
					System.out.println("|45| Ejercicio");
					System.out.println("|0| salir");
					opcion2 = leer.nextInt();
					System.out.println();
					
					switch(opcion2) {
					
					case 0:
						
						break;
					
					case 25:
						
						ejercicio25();
						
						break;
						
					case 27:
						
						ejercicio27();
						
						break;
						
					case 29:
						
						ejercicio29();
						
						break;
						
					case 31:
						
						ejercicio31();
						
						break;
						
					case 33:
						
						ejercicio33();
						
						break;
						
					case 35:
						
						ejercicio35();
						
						break;
						
					case 37:
						
						ejercicio37();
						
						break;
						
					case 39:
						
						ejercicio39();
						
						break;
						
					case 41:
						
						ejercicio41();
						
						break;
						
					case 43:
						
						ejercicio43();
						
						break;
						
					case 45:
						
						ejercicio45();
						
						break;
						
				    default:
				    	
				    	System.out.println("Porfavor elija una opcion correcta");
				    	System.out.println();
				    	
				    	break;
					
					}
				   
			   } while (opcion2 != 0);
			   
			   System.out.println("Saliendo de los ejercicios de decision......");
			   System.out.println();
			   
			break;
			
			//EJERCICIO DE DECISIONES
		
		}
				
		} while (opcion != 0);
		
		System.out.println("Gracias por estar!!!!");

	}
	
	//METODOS DE LA CLASE
	
	//EJERCICIOS SECUENCIALES
	
	public static void ejercicio1() {
		
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 1---");
		System.out.println();
		
		int edad1 = 0, edad2 = 0, edad3 = 0, promedioEdad = 0;
		
	    System.out.println("Ingresa la edad de la persona 1");
	    edad1 = lapiz.nextInt();
	    System.out.println();
	    
	    System.out.println("Ingresa la edad de la persona 2");
	    edad2 = lapiz.nextInt();
	    System.out.println();
	    
	    System.out.println("Ingresa la edad de la persona 3");
	    edad3 = lapiz.nextInt();
	    System.out.println();
	    
	    promedioEdad = (edad1+edad2+edad3) / 3;
	    
	    System.out.println("el promedio de edad de las personas es "+promedioEdad);
	    System.out.println();
	  
		
	}
	
	public static void ejercicio3() {
		
		Scanner lapiz = new Scanner(System.in);
		
		 System.out.println("---EJERCICIO 3---");
		 System.out.println();
			
		    int Sueldo = 1350000, SueldoTotal = 0;
		    double Porcentaje = 0.10, ComisionesTotal = 0;
		    
		    ComisionesTotal = (0.10 * 3) * Sueldo;
		    
		    SueldoTotal = Sueldo +  (int)ComisionesTotal;
		    
		    System.out.println("Su sueldo total fue de "+SueldoTotal);
		    System.out.println();
		
	}
	
    public static void ejercicio5() {
    	
		Scanner lapiz = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 5---");
		System.out.println();
		
		double notaParcial1 = 0, notaParcial2 = 0, notaParcial3 = 0, notaExamen = 0, notaTrabajoFinal = 0;
		double PromedioParcial = 0, CalificacionFinal = 0;
		
		System.out.println("Ingresa su primera nota del parcial");
	    notaParcial1 = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Ingresa su segunda nota del parcial");
	    notaParcial2 = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Ingresa su tercera nota del parcial");
	    notaParcial3 = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Ingresa su nota del examen final");
	    notaExamen = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Ingresa su nota del trabajo final");
	    notaTrabajoFinal = lapiz.nextDouble();
	    System.out.println();
		
	    PromedioParcial = (notaParcial1+notaParcial2+notaParcial3) / 3 * 0.55;
	    CalificacionFinal = (PromedioParcial) + (notaExamen*0.30) + (notaTrabajoFinal*0.15);
	    
	    System.out.println("Su nota total es de: "+CalificacionFinal);
		System.out.println();
		
	}

    public static void ejercicio7() {
    	
		Scanner lapiz = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 7---");
		System.out.println();
		
		double metro = 39.27, pie = 12, tamañoMetros = 0.0, ConversionPies = 0.0;
		
		System.out.println("Ingresa cualquier valor en metros");
		tamañoMetros = lapiz.nextDouble();
		System.out.println();
		
		ConversionPies = tamañoMetros * metro / pie;
		
		System.out.println("El tamaño en: "+tamañoMetros+" metros es igual en pulgadas en: "+ConversionPies);
		System.out.println();
		
	}
    
    public static void ejercicio9() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 9---");
		System.out.println();
		
		double Salario = 0, Impuesto = 0.20, SalarioTotal = 0, Descuento = 0;
		int HorasTrabajadas = 0;
		
		System.out.println("Ingresa su salario base");
	    Salario = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Ingresa las horas que trabajo");
	    HorasTrabajadas = lapiz.nextInt();
	    System.out.println();
	    
	    Descuento = (Salario * HorasTrabajadas) * 0.20; 
	    SalarioTotal = (Salario * HorasTrabajadas) - Descuento;
	    
	    System.out.println("El salario neto es: " + SalarioTotal);
	    System.out.println();
		
	}
    
    public static void ejercicio11() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 11---");
  		System.out.println();
  		
  		String Nombre;
  		int HorasNormales = 0, HorasExtras = 0, Hijos = 0, Hogar = 0;
  		double PagoHora = 0,  TotalSalario = 0, TotalHorasExtras = 0, SalarioNeto = 0;
  		double ParoForzoso = 0.05, Politica = 0.02, Caja = 0.07, Deducciones = 0;
  		double Actualizacion = 25.000, HijoValor = 17.300, PrimaHogar = 18.000, Asignacion = 0;
  		
  		System.out.println("Ingresa el nombre del trabajador");
	    Nombre = lapiz.next();
	    System.out.println();
	    
	    System.out.println("Ingresa las horas trabajadas por el trabajador");
	    HorasNormales = lapiz.nextInt();
	    System.out.println();
	    
	    System.out.println("Ingresa la paga por hora");
	    PagoHora = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Numero extra de horas trabajadas");
	    HorasExtras = lapiz.nextInt();
	    System.out.println();
	    
	    System.out.println("Escriba cuantos hijos tiene el trabajador");
	    Hijos = lapiz.nextInt();
	    System.out.println();
	    
	    System.out.println("Escriba cuantos hogares tiene el trabajador");
	    Hogar = lapiz.nextInt();
	    System.out.println();
	    	    
	    TotalHorasExtras = HorasExtras * 0.25 * PagoHora;
	    TotalSalario = (PagoHora * HorasNormales) + TotalHorasExtras;
	    
	    Deducciones = TotalSalario * (ParoForzoso + Politica + Caja);
	    Asignacion = Actualizacion + (Hijos * HijoValor) + (Hogar * PrimaHogar);
	    
	    SalarioNeto = TotalSalario - Deducciones;
	    
	    System.out.println("Nombre: "+Nombre);
	    System.out.println("Asignaciones: " + Asignacion);
        System.out.println("Deducciones: " + Deducciones);
        System.out.println("Sueldo Neto: " + SalarioNeto);
        System.out.println();
		
	}
    
    public static void ejercicio13() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 13---");
  		System.out.println();
  		
  		int N1 = 50000, N2 = 20000, N3 = 10000, N4 = 5000, N5 = 2000, N6 = 1000, N7 = 500, N8 = 100;
  		int TotalDinero = 0;
  		
  		TotalDinero = N1 + N2 + N3 + N4 + N5 + N6 + N7 + N8;
  		
  		System.out.println("El banco tienen en total: "+TotalDinero);
  		System.out.println();
		
	}
    
    public static void ejercicio15() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 15---");
  		System.out.println();
  		
  		double lecturaAnt = 0, lecturaAct = 0, CostoVatio = 0, ConsumoTotal = 0;
  		
  		System.out.println("Escriba la lectura anterior");
	    lecturaAnt = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Escriba la lectura actual");
	    lecturaAct = lapiz.nextDouble();
	    System.out.println();
	    
	    System.out.println("Escriba el costo por kilovatio");
	    CostoVatio = lapiz.nextDouble();
	    System.out.println();
	    
	    ConsumoTotal = (lecturaAct - lecturaAnt) * CostoVatio;
	    
	    System.out.println("El monto a pagar es de: "+ConsumoTotal);
	    System.out.println();
		
	}
    
    public static void ejercicio17() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 17---");
  		System.out.println();
  		
  		double PVP = 0, PrecioFinal = 0, DescuentoAplicado = 0;
  		
        System.out.println("Ingrese el precio de venta al público (PVP):");
        PVP = lapiz.nextDouble();
        System.out.println();

        System.out.println("Ingrese el precio final pagado por el cliente:");
        PrecioFinal = lapiz.nextDouble();
        System.out.println();
        
        DescuentoAplicado = (PVP - PrecioFinal) / PVP * 100;

        System.out.println("El porcentaje de descuento aplicado es: " + DescuentoAplicado + "%");
        System.out.println("");
		
	}
    
    public static void ejercicio19() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 19---");
  		System.out.println();
  		
  		double Presupuesto = 0, Ginecologia = 0.40, Traumatologia = 0.30, Pediatria = 0.30;
  		double MontoGinecologia = 0, MontoTraumatologia = 0, MontoPediatria = 0;
  		
  		System.out.println("Ingresa el presupuesto anual para el hospital");
  		Presupuesto = lapiz.nextDouble();
  		System.out.println();
  		
  		MontoGinecologia = Presupuesto * Ginecologia;
  		MontoTraumatologia = Presupuesto * Traumatologia;
  		MontoPediatria = Presupuesto * Pediatria;
  		
  		System.out.println("Su presupuesto fue de: "+Presupuesto);
  		System.out.println("El monto recibido para el area de Ginecologia sera de: "+MontoGinecologia);
  		System.out.println("El monto recibido para el area de Traumatologia sera de: "+MontoTraumatologia);
  		System.out.println("El monto recibido para el area de Pediatria sera de: "+MontoPediatria);
  		System.out.println();
		
	}
    
    public static void ejercicio21() {
    	
		Scanner lapiz = new Scanner(System.in);
		
		System.out.println("---EJERCICIO 21---");
  		System.out.println();
  		
  		double X = 48000, Y = 6, K = 42000, Ganancia = 0;
  		
  		Ganancia = ((K - (X * Y)) / (X * Y)) * 100;
  		
  		System.out.println(Ganancia+"%");
  		System.out.println();
		
	}
    
  //EJERCICIOS DE DECISIONES
    
    public static void ejercicio25() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 25---");
  		System.out.println();
  		
  		double sueldo = 0, aumento = 0, SueldoTotal = 0;
  		
  		System.out.println("Ingresa el sueldo del empleado en bolivares");
        sueldo = leer.nextDouble();
        System.out.println();
        
        if(sueldo < 40.000) {
        	
        	aumento = sueldo * 0.15;
        	SueldoTotal = sueldo + aumento;
        	System.out.println("El sueldo es de: "+sueldo+" con el 15% del aumento queda en: "+SueldoTotal);
        	System.out.println();
        	
        } else {
        	
        	aumento = sueldo * 0.12;
        	SueldoTotal = sueldo + aumento;
        	System.out.println("El sueldo es de: "+sueldo+" con el 12% del aumento queda en: "+SueldoTotal);
        	System.out.println();
        	
        }
		
	}
    
    public static void ejercicio27() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 27---");
  		System.out.println();
  		
  		double valor1 = 0, valor2 = 0,  valor3 = 0, areaTriangulo = 0, areaCirculo = 0, areaRectangulo = 0;
  		
  		System.out.println("Ingresa el valor1");
  		valor1 = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Ingresa el valor2");
  		valor2 = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Ingresa el valor3");
  		valor3 = leer.nextDouble();
  		System.out.println();
  		
  		areaTriangulo = (valor1 * valor2) / 2;
  		areaCirculo = valor1 * Math.pow(valor2, 2);
  		areaRectangulo = valor1 * valor2;
  		
  		if (areaTriangulo == valor3) {
  			
  			System.out.println("El tercer valor coincide con el area del triangulo");
  			System.out.println();
  			
  		}
  			
  			else if(areaCirculo == valor3) {
  				
  				System.out.println("El tercer valor coincide con el area del circulo");
  	  			System.out.println();
  				
  			}
  		
            else if(areaRectangulo == valor3) {
  				
  				System.out.println("El tercer valor coincide con el area del rectangulo");
  	  			System.out.println();
  				
  			}
  		
            else {
            	
            	System.out.println("El area del valor3 no coincide con ninguno de los valores");
            	System.out.println();
            	
            }
            
		
	}
    
    public static void ejercicio29() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 29---");
  		System.out.println();
  		
  		int Atlantico = 0, Choco = 0, Cordoba = 0, VentasTotales = 0, SalarioMensual = 1350000;
  		double Porcentaje = 0, ExtraAtlantico = 0, ExtraChoco = 0, ExtraCordoba = 0;
  		double TotalAtlantico = 0, TotalCordoba = 0, TotalChoco = 0;
  		
  		System.out.println("Ingresa las ventas que se han realizado en Atlantico");
  		Atlantico = leer.nextInt();
  		System.out.println();
  		
  		System.out.println("Ingresa las ventas que se han realizado en Choco");
  		Choco = leer.nextInt();
  		System.out.println();
  		
  		System.out.println("Ingresa las ventas que se han realizado en Cordoba");
  		Cordoba = leer.nextInt();
  		System.out.println();
  		
  		VentasTotales = Atlantico + Choco + Cordoba;
  		Porcentaje = 0.33 * VentasTotales;
  		
  		if(Atlantico > Porcentaje) {
  			
  			ExtraAtlantico = 0.20 * SalarioMensual;
  			System.out.println("Pago extra para el departamento de atlantico es de: "+ExtraAtlantico);
  			TotalAtlantico = SalarioMensual + ExtraAtlantico;
  			
  		}
  		
  		else {
  			
  			TotalAtlantico = SalarioMensual;
  			
  		}
  		
  		if(Choco > Porcentaje) {
  			
  			ExtraChoco = 0.20 * SalarioMensual;
  			System.out.println("Pago extra para el departamento de Choco es de: "+ExtraChoco);
  			TotalChoco = SalarioMensual + ExtraChoco;
  			
  		}
  		
  		else {
  			
  			TotalChoco = SalarioMensual;
  			
  		}
  		
        if(Cordoba > Porcentaje) {
  			
  			ExtraCordoba = 0.20 * SalarioMensual;
  			System.out.println("Pago extra para el departamento de Cordoba es de: "+ExtraCordoba);
  			TotalCordoba = SalarioMensual + ExtraCordoba;
  			
  		}
        
        else {
        	
        	TotalCordoba = SalarioMensual;
        	
        }
        
        System.out.println();
        
  		System.out.println("El pago total del departamento Atlantico es de: "+TotalAtlantico);
  		System.out.println("El pago total del departamento Cordoba es de: "+TotalCordoba);
  		System.out.println("El pago total del departamento Choco es de: "+TotalChoco);
		
	}
    
    public static void ejercicio31() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 31---");
  		System.out.println();
  		
  		int km = 0, Monto1 = 0, Monto2 = 0, Monto3 = 0;
  		
  		System.out.println("Ingresa los km recorridos por el cliente");
  		km = leer.nextInt();
  		System.out.println();
  		
  		if(km > 300 && km < 1000) {
  			
  		    Monto1 = 5000 + (km - 300) * 200;
  		    System.out.println("El monto a pagar es de: "+Monto1);
  		    System.out.println();
  		    
  		} else if (km > 1000) {
  			
  		    Monto2 = (km - 1000) * 150;
  		    Monto2 = Monto1 + Monto2;
  		    System.out.println("El monto a pagar es de: "+Monto2);
  		    System.out.println();
  		    
  		} else {
  			
  		    Monto3 = 5000;
  		    System.out.println("El monto a pagar es de: "+Monto3);
		    System.out.println();
  		}
		
	}
    
    public static void ejercicio33() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 33---");
  		System.out.println();
  		
  		String nombre;
  		double CompraMonto = 0, Descuento = 0, TotalMonto = 0;
  		
  		System.out.println("Ingresa el nombre del cliente");
  		nombre = leer.next();
  		System.out.println();
  		
  		System.out.println("Ingresa el monto de la compra");
  		CompraMonto = leer.nextDouble();
  		System.out.println();
  		
  		if(CompraMonto < 500) {
  			
  			System.out.println("Hola: "+nombre);
  			System.out.println("Su monto es de: "+CompraMonto);
  			System.out.println();
  			
  		} else if (CompraMonto >= 500 && CompraMonto <= 1000) {
  			
  			
  			Descuento = CompraMonto * 0.05;
  			TotalMonto = CompraMonto - Descuento;
  			
  			System.out.println("Hola: "+nombre);
  			System.out.println("Su monto es de: "+CompraMonto);
  			System.out.println("Obtuvo un 5% de descuento por lo que su monto queda a: "+TotalMonto);
  			
  		} else if (CompraMonto >= 1000 && CompraMonto <= 7000) {
  			
  			Descuento = CompraMonto * 0.11;
  			TotalMonto = CompraMonto - Descuento;
  			
  			System.out.println("Hola: "+nombre);
  			System.out.println("Su monto es de: "+CompraMonto);
  			System.out.println("Obtuvo un 11% de descuento por lo que su monto queda a: "+TotalMonto);
  			
  		} else if (CompraMonto >= 7000 && CompraMonto <= 15000) {
  			
  			Descuento = CompraMonto * 0.18;
  			TotalMonto = CompraMonto - Descuento;
  			
  			System.out.println("Hola: "+nombre);
  			System.out.println("Su monto es de: "+CompraMonto);
  			System.out.println("Obtuvo un 18% de descuento por lo que su monto queda a: "+TotalMonto);
  			
  		} else {
  			
  			Descuento = CompraMonto * 0.25;
  			TotalMonto = CompraMonto - Descuento;
  			
  			System.out.println("Hola: "+nombre);
  			System.out.println("Su monto es de: "+CompraMonto);
  			System.out.println("Obtuvo un 25% de descuento por lo que su monto queda a: "+TotalMonto);
  			
  		}
		
	}
    
    public static void ejercicio35() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 35---");
  		System.out.println();
  		
  		int temperatura = 0;
  		
  		System.out.println("Ingrese la temperatura en grados");
  		temperatura = leer.nextInt();
  		System.out.println();
  		
  		if(temperatura > 85) {
  			
  			System.out.println("Su temperatura ingresada es de: "+temperatura+" grados");
  			System.out.println("La temperatura de "+temperatura+" grados es adecuada para el deporte de natacion");
  			
  		} else if (temperatura > 70 && temperatura < 85) {
  			
  			System.out.println("Su temperatura ingresada es de: "+temperatura+" grados");
  			System.out.println("La temperatura de "+temperatura+" grados es adecuada para el deporte de Tenis");
  			
  		} else if (temperatura > 32 && temperatura < 70) {
  			
  			System.out.println("Su temperatura ingresada es de: "+temperatura+" grados");
  			System.out.println("La temperatura de "+temperatura+" grados es adecuada para el deporte de Golf");
  			
  		}  else if (temperatura > 10 && temperatura < 32) {
  			
  			System.out.println("Su temperatura ingresada es de: "+temperatura+" grados");
  			System.out.println("La temperatura de "+temperatura+" grados es adecuada para el deporte de Esqui");
  			
  		} else {
  			
  			System.out.println("Su temperatura ingresada es de: "+temperatura+" grados");
  			System.out.println("La temperatura de "+temperatura+" grados es adecuada para el deporte de Marcha");
  			
  		}
  		
  		System.out.println();
		
	}
    
    public static void ejercicio37() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 37---");
  		System.out.println();
  		
  		double A = 0, B = 0, C = 0, S = 0, area = 0;
		
  		System.out.println("Ingresa la longitud del A");
  		A = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Ingresa la longitud del B");
  		B = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Ingresa la longitud del C");
  		C = leer.nextDouble();
  		System.out.println();
  		
  		S = (A + B + C) / 2;
  		
  		area = Math.sqrt(S * (S - A) * (S - B) * (S - C));
  		
  		if (A == B && B == C && C == A) {
  			
  			System.out.println("El triangulo es un equilatero");
  			
  		}
  		
  		else if ((A == B && B != C) || (B == C && C != A) || (C == A && A != B)) {
  			
  			System.out.println("El triangulo es un isosceles");
  			
  		}
  		
  		else {
  			
  			System.out.println("El triangulo es un escaleno");
  			
  		}
  		
  		System.out.println();
  		
		
	}
    
    public static void ejercicio39() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 39---");
  		System.out.println();
  		
  		double carro = 0, terreno = 0, devaluacion = 0, incremento = 0;
  		
  		System.out.println("Escriba el valor del carro y terreno(tanto el carro como el terreno tendran el mismo valor o precio");
  		carro = leer.nextDouble();
  		terreno = carro;
  		System.out.println();
  		
  		devaluacion = carro * 3 * 0.01;
  		carro = carro - devaluacion;
  		
  		incremento = terreno * 3 * 0.01;
  		terreno = terreno + incremento;
  		
  		if (carro <= 0.50 * terreno) {
  			
  			System.out.println("Compra el automovil");
  			System.out.println("Valor final del automóvil después de 3 años: " + carro);
  			System.out.println("Valor final del terreno después de 3 años: " + terreno);
  			
  		}
  		
  		else {
  			
  			System.out.println("No compres el automovil");
  			System.out.println("Valor final del automóvil después de 3 años: " + carro);
  			System.out.println("Valor final del terreno después de 3 años: " + terreno);
  			
  		}
  		
  		System.out.println();
		
	}
    
    public static void ejercicio41() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 41---");
  		System.out.println();
  		
  		double Superficie = 0, Pino = 0, Oyamel = 0, Cedro = 0;
  		
  		System.out.println("Escribe en metros cuadrados la superficie del terreno");
  		Superficie = leer.nextDouble();
  		System.out.println();
  		
  		if(Superficie > 1000000) {
  			
  			Pino = Superficie * 0.70;
  			Oyamel = Superficie * 0.20;
  			Cedro = Superficie * 0.10;
  			
  			System.out.println("El arbol pino cubre un 70% de la superficie total de: "+Pino);
  			System.out.println("El arbol oyamel cubre un 20% de la superficie total de: "+Oyamel);
  			System.out.println("El arbol cedro cubre un 10% de la superficie total de: "+Cedro);
  			System.out.println();
  			
  		}
  		
  		else {
  			
  			Pino = Superficie * 0.50;
  			Oyamel = Superficie * 0.30;
  			Cedro = Superficie * 0.20;
  			
  			System.out.println("El arbol pino cubre un 50% de la superficie total de: "+Pino);
  			System.out.println("El arbol oyamel cubre un 30% de la superficie total de: "+Oyamel);
  			System.out.println("El arbol cedro cubre un 20% de la superficie total de: "+Cedro);
  			System.out.println();
  			
  		}
		
	}
    
    public static void ejercicio43() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 43---");
  		System.out.println();
  		
  		double saldoInicial = 0, Ganancias = 0, Recaudacion = 0, saldoActual = 0;
  		
  		System.out.println("Escriba el saldo inicial de la empresa");
  		saldoInicial = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Escriba las ganancias de la empresa");
  		Ganancias = leer.nextDouble();
  		System.out.println();
  		
  		if(saldoInicial < Ganancias) {
  			
  			saldoActual = 10000 - 5000 - 2000;
  			
  			System.out.println("Su empresa se encuentra con saldo negativo, pidio prestado $10000 del banco");
  			System.out.println("$5000 se va para el equipo de computo, $2000 para el mobiliario y el resto para la compra de insumos y incentivos al personal sera de: "+saldoActual);
  			System.out.println();
  			
  		}
  		
  		else if(saldoInicial > 20000) {
  			
  			saldoActual = saldoInicial - 5000 - 2000;
  			
  			System.out.println("$5000 se va para el equipo de computo, $2000 para el mobiliario y el resto para la compra de insumos y incentivos al personal sera de: "+saldoActual);
  			System.out.println();
  			
  		}
  		
  		else {
  			
            saldoActual = 20000 - 5000 - 2000;
  			
  			System.out.println("Su empresa se encuentra con saldo positivo, pidio prestado $20000 del banco");
  			System.out.println("$5000 se va para el equipo de computo, $2000 para el mobiliario y el resto para la compra de insumos y incentivos al personal sera de: "+saldoActual);
  			System.out.println();
  			
  		}
		
	}
   
    public static void ejercicio45() {
    	
    	Scanner leer = new Scanner(System.in);
    	
    	System.out.println("---EJERCICIO 45---");
  		System.out.println(); 
  		
  		double Dd = 0, Bb = 0, Aa = 0, Cc = 0, X1 = 0, X2 = 0;
  		
  		System.out.println("Escribe un valor en A");
  		Aa = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Escribe un valor en B");
  		Bb = leer.nextDouble();
  		System.out.println();
  		
  		System.out.println("Escribe un valor en C");
  		Cc = leer.nextDouble();
  		System.out.println();
  		
  		Dd = Math.pow(Bb, 2) - 4 * Aa * Cc;
  		
  		if(Dd == 0) {
  			
  			X1 = X2 = -Bb/(2*Aa);
  			System.out.println("La solucion es: "+X1);
  			System.out.println();
  			
  		}
  		
  		else if (Dd > 0) {
  			
  			X1 = (-Bb + Math.sqrt(Bb*2-4*Aa*Cc)) / (2*Aa);
  			X2 = (-Bb - Math.sqrt(Bb*2-4*Aa*Cc)) / (2*Aa);
  			
  			System.out.println("La solucion es: "+X1+" y "+X2);
  			System.out.println();
  			
  		}
  		
  		else {
  			
  			System.out.println("No tiene solucion en los reales");
  			System.out.println();
  		}
		
	}
    
}
