# Toll Station System

## **Descripción del Proyecto**
Este es un sistema para gestionar peajes, diseñado utilizando el patrón de diseño **MVC (Model-View-Controller)**. Permite procesar vehículos que pasan por estaciones de peaje, calcular los peajes correspondientes, y generar un reporte detallado de los ingresos recolectados y los vehículos procesados.

---

## **Estructura del Proyecto**
El proyecto sigue el patrón MVC y tiene la siguiente estructura de carpetas:

```
TollSystem/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/
│   │   │   │   └── TollStationController.java
│   │   │   ├── model/
│   │   │   │   ├── Vehicle.java
│   │   │   │   ├── Car.java
│   │   │   │   ├── Motorcycle.java
│   │   │   │   ├── Truck.java
│   │   │   │   └── TollStation.java
│   │   │   ├── view/
│   │   │   │   └── TollStationView.java
│   │   │   └── Main.java
│   ├── test/
│       ├── controller/
│       │   └── TollStationControllerTest.java
│       ├── model/
│       │   ├── TollStationTest.java
│       │   ├── CarTest.java
│       │   ├── MotorcycleTest.java
│       │   ├── TruckTest.java
│       │   └── VehicleTest.java
│       └── view/
│           └── TollStationViewTest.java
```

---

## **Requisitos Previos**
Asegúrate de tener instalado lo siguiente:

- **Java JDK 11** o superior
- **Apache Maven**
- IDE recomendado: **Visual Studio Code** (o IntelliJ IDEA)

---

## **Cómo Ejecutar el Proyecto**

### **1. Clonar el repositorio**
```bash
git clone <URL_DEL_REPOSITORIO>
cd TollSystem
```

### **2. Compilar el proyecto**
Ejecuta el siguiente comando para compilar el código fuente:
```bash
mvn clean compile
```

### **3. Ejecutar el programa**
Para ejecutar el programa principal, usa el siguiente comando:
```bash
mvn exec:java -Dexec.mainClass="Main"
```

---

## **Ejecución de Pruebas Unitarias**
El proyecto incluye un conjunto de pruebas unitarias para asegurar la funcionalidad del sistema.

### **1. Ejecutar las pruebas**
```bash
mvn test
```

### **2. Generar reporte de cobertura**
Usamos JaCoCo para verificar la cobertura de las pruebas:
```bash
mvn jacoco:report
```

### **3. Ver reporte**
Abre el archivo generado en tu navegador:
```
target/site/jacoco/index.html
```

---

## **Características**

### **1. Estación de Peaje**
- Cada estación tiene un nombre, una ciudad, y un total acumulado de peajes recolectados.
- Puede procesar múltiples vehículos.

### **2. Tipos de Vehículos**
- **Car:** Paga un peaje fijo de $100.
- **Motorcycle:** Paga un peaje fijo de $50.
- **Truck:** Paga $50 por cada eje.

### **3. Funcionalidad Principal**
- Procesa vehículos.
- Calcula y acumula peajes.
- Genera un reporte detallado con los ingresos totales y los vehículos procesados.

---
## Diagrama UML de clases
   
  <pre>
+------------------------+
|       Vehicle          |  <-- Clase abstracta
+------------------------+
| - licensePlate: String |
| - tollAmount: double   |
+------------------------+
| + calculateToll(): void|
+------------------------+
          ▲
          |
   -----------------
   |       |       |
+------+ +------+ +-------+
| Car  | | Truck | |Motorcycle|
+------+ +------+ +-------+
|      | |- numAxles: int| |
|      | +calculateToll(): |
|      +------------------+
|

+--------------------------+
|     TollStation          |
+--------------------------+
| - stationName: String    |
| - Total: String          |
+--------------------------+

</pre>

## **Pruebas y Cobertura**
Este sistema cuenta con pruebas unitarias que cubren al menos el **70%** del código, probando:

<h3>Captura de la cobertura de tests</h3>
    <img src="/src/foto/Imagen pegada.png"  alt="Cobertura de Tests" />

- Inicialización de clases principales.
- Procesamiento de vehículos y acumulación de peajes.
- Casos bordes (placas vacías, camiones con 0 ejes, etc.).

---
<p><strong>Autor:</strong> FUAD AL KWKABANI  <a href="https://github.com/Fuad-Alkwkabani">GitHub</a>


