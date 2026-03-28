# BatiPet - Sistema de Gestión para Clínica Veterinaria

## 📋 Descripción

BatiPet es un **Sistema de Gestión integral** para la Clínica Veterinaria "BatiPet", desarrollado como proyecto de laboratorio en un curso universitario. El sistema está diseñado para administrar eficientemente todas las operaciones médicas veterinarias, facilitando el registro de mascotas, clientes, citas médicas, servicios ofrecidos e inventario de medicamentos y equipos.

## ✨ Características Principales

### 📁 Gestión de Mascotas
- Registro completo de mascotas con número de expediente único
- Información básica: nombre, edad, peso
- Datos de caracterización: especie, raza, tipo de pelaje
- Histórico clínico: vacunas, tratamientos previos, condiciones especiales de salud
- Soporte para múltiples especies: caninos, felinos, aves y pequeños mamíferos

### 👥 Gestión de Clientes
- Registro de propietarios con datos personales completos
- Almacenamiento de identificación, contacto y dirección exacta
- Vinculación con todas las mascotas del cliente

### 📅 Administración de Citas
- Programación de citas médicas con fecha y hora
- Asignación de servicios requeridos
- Designación de profesional responsable
- Seguimiento de estado: confirmada, en progreso, finalizada

### 🏥 Servicios Médicos
- Consultas de rutina
- Intervenciones quirúrgicas
- Terapias rehabilitadoras
- Servicios de estética animal
- Cada servicio posee: código, requisitos, duración promedio y tarifa

### 👨‍⚕️ Gestión de Personal
- Registro de médicos veterinarios y auxiliares clínicos
- Diferenciación por especialización (traumatología, oftalmología, etc.)
- Gestión de turnos laborales
- Niveles de experiencia profesional

### 📦 Control de Inventario
- Monitoreo de medicamentos disponibles
- Control de materiales desechables
- Gestión de equipos médicos
- Registro de alimentos especializados
- Alertas de vencimiento y niveles de stock

### 💳 Comprobantes de Servicio
- Generación de transacciones con número único
- Detalle de servicios prestados
- Registro de medicamentos suministrados
- Cálculo de costo final
- Seguimiento de forma de pago

## 🛠️ Requisitos Previos

- **Java 17 o superior**
- **IDE Java** (IntelliJ IDEA, Eclipse o NetBeans recomendado)
- **Sistema operativo**: Windows, macOS o Linux

## 📦 Instalación

1. **Clonar o descargar el repositorio**
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd BatiPet
   ```

2. **Compilar el proyecto**
   ```bash
   javac -d bin src/*.java
   ```

3. **Ejecutar la aplicación**
   ```bash
   java -cp bin Main
   ```

## 📂 Estructura del Proyecto

```
BatiPet/
├── src/
│   ├── Main.java                 # Punto de entrada de la aplicación
│   ├── Gestor.java              # Clase gestora principal
│   ├── Registrar_cliente.java    # Módulo de registro de clientes
│   ├── Agregar_mascota.java      # Módulo de agregar/registrar mascotas
│   └── Adoptar_mascota.java      # Módulo de adopción de mascotas
├── BatiPet.iml                  # Configuración del proyecto IntelliJ
└── README.md                    # Este archivo
```

## 🚀 Uso

### Iniciar la Aplicación
```bash
java -cp bin Main
```

### Módulos Disponibles

- **Registrar Cliente**: Crear nuevo propietario en el sistema
- **Agregar Mascota**: Registrar mascotas asociadas a un cliente
- **Adoptar Mascota**: Procesar adopciones de mascotas
- **Gestor**: Administración central de operaciones

## 📝 Ejemplo de Uso Básico

```java
// Registrar un nuevo cliente
Registrar_cliente registrador = new Registrar_cliente();
registrador.registrar();

// Agregar una mascota
Agregar_mascota agregarMascota = new Agregar_mascota();
agregarMascota.registrarMascota();

// Adoptar una mascota
Adoptar_mascota adoptar = new Adoptar_mascota();
adoptar.procesarAdopcion();
```

## 🏗️ Tecnologías Utilizadas

- **Lenguaje**: Java
- **Paradigma**: Programación Orientada a Objetos (POO)
- **IDE**: IntelliJ IDEA (compatible con otros IDEs Java)

## 📄 Licencia

Este proyecto es de uso académico y educativo como parte de un laboratorio de curso universitario.