# 🍕 Sistema de Pizzería "The Best"

> Sistema de pedidos de pizzería con personalización de tamaño e ingredientes

## 📋 Descripción

Aplicación de consola en Java que permite a los clientes realizar pedidos de pizza personalizados, seleccionando el tamaño y los ingredientes. El sistema calcula automáticamente el precio total del pedido.

## 🎯 Funcionalidades

- 👤 Registro de datos del cliente (nombre y edad)
- 📏 Selección de tamaño de pizza
- 🧀 Elección de ingredientes
- 💰 Cálculo automático del total
- ✅ Validación de entrada de datos
- 🧾 Resumen del pedido

## 💵 Precios

### 📏 Tamaños de Pizza

| Tamaño | Precio |
|--------|--------|
| 🍕 Grande | $30,000 COP |
| 🍕 Mediana | $25,000 COP |
| 🍕 Pequeña | $20,000 COP |

### 🧀 Ingredientes Adicionales

| Ingredientes | Precio |
|--------------|--------|
| 🍍 Piña + 🍗 Pollo | $9,000 COP |
| 🥩 Carne + 🌽 Maíz | $11,000 COP |
| 🍖 Peperoni | $3,000 COP |

## 🚀 Cómo usar

### Requisitos
- Java JDK 8 o superior

### Ejecución

```bash
# Compilar
javac pizzeria/*.java

# Ejecutar
java pizzeria.Pizzeria
```

### Ejemplo de uso

```
BIENVENIDOS A LA PIZZERIA THE BEST

Ingrese su nombre
> Carlos Rodríguez

Ingrese su edad
> 25

Elige el tamaño
1. Grande (30000)
2. Mediana (25000)
3. Pequeña (20000)
> 2

Elige los ingredientes
1. Piña y pollo (9000)
2. Carne y maíz (11000)
3. Peperoni (3000)
> 1

Nombre cliente: Carlos Rodríguez | Edad: 25 | Total a pagar: $34000.0
```

## 📊 Ejemplos de Cálculo

### Ejemplo 1: Pizza Grande con Peperoni
- Pizza Grande: $30,000
- Peperoni: $3,000
- **Total: $33,000**

### Ejemplo 2: Pizza Mediana con Carne y Maíz
- Pizza Mediana: $25,000
- Carne + Maíz: $11,000
- **Total: $36,000**

### Ejemplo 3: Pizza Pequeña con Piña y Pollo
- Pizza Pequeña: $20,000
- Piña + Pollo: $9,000
- **Total: $29,000**

## 🏗️ Estructura del Proyecto

```
pizzeria/
├── Pizzeria.java      # Clase principal (Main)
├── Pizza.java         # Lógica de selección y cálculo
└── Pedido.java        # Datos del cliente
```

## 🛠️ Tecnologías

- Java SE
- Scanner para entrada de datos
- POO (Programación Orientada a Objetos)
- Manejo de excepciones (try-catch)

## 💡 Características del Código

- ✅ Validación de entrada numérica
- 🔄 Manejo de errores con excepciones
- 🎯 Uso de clases y métodos
- 📦 Encapsulamiento de datos
- 🔀 Control de flujo con switch-case

## 🎓 Conceptos Aplicados

- **POO**: Clases `Pedido` y `Pizza`
- **Encapsulamiento**: Getters y setters
- **Validación**: Try-catch para entradas inválidas
- **Métodos**: `elegirTamaño()` y `calcularTotal()`

## 👤 Autor

**Nicko699**
- GitHub: [@Nicko699](https://github.com/Nicko699)

---

🍕 **¡Disfruta tu pizza!**
