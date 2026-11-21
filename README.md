# U3-ejercicio9
# 🚘 Gestión de Velocidad en un Crucero Automotriz

Ejercicio de **Programación Orientada a Objetos en Java** que modela un control de velocidad crucero aplicando el principio de **encapsulamiento**. La velocidad actual y el límite máximo están declarados como privados y la velocidad solo puede modificarse mediante métodos de aceleración y frenado que garantizan que nunca sea menor a cero ni supere el máximo permitido.

## 🎯 Objetivo

Encapsular la velocidad de un automóvil y gestionar sus límites operativos mediante métodos seguros, protegiendo tanto la mecánica del motor como la seguridad vial.

## ✨ Características

- Atributos privados: `velocidadActual` y `velocidadMaximaPermitida`.
- `acelerar(double incremento)`: suma velocidad hasta alcanzar, como máximo, el límite permitido.
- `frenar(double decremento)`: resta velocidad hasta llegar, como mínimo, a 0 km/h.
- Rechazo de valores inválidos: negativos, cero, `NaN` e infinitos.
- Sin setter de velocidad: el estado se consulta con `getVelocidadActual()`.
- Constructor que fija la velocidad inicial en 0 y exige un límite máximo válido.
## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Getters · Validación de datos · Límites operativos · Constructores · Métodos privados


![U3 ejercicio9](U3%20ejercicio9.png)
