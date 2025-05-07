# Convertidor de Monedas 💱

Este proyecto es una aplicación Java que permite convertir entre diferentes monedas y consultar información relacionada con ellas. Es ideal para quienes necesitan realizar conversiones rápidas y precisas. 🚀

## Estructura del Proyecto 📂

El proyecto tiene la siguiente estructura:

```
convertidordemonedas/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/alura/
│   │   │   │   ├── consultarMoneda.java
│   │   │   │   ├── convertidorMonedas.java
│   │   │   │   ├── Main.java
│   │   │   │   ├── Moneda.java
│   ├── resources/
│   ├── test/
│       ├── java/
```

## Funcionalidades ✨

1. **Convertidor de Monedas**: Convierte entre diferentes monedas de manera eficiente.
2. **Consulta de Monedas**: Obtén información detallada sobre las monedas disponibles.

## Ejemplo de Uso 📖

A continuación, se muestra un ejemplo de cómo utilizar la clase `convertidorMonedas`:

```java
// Crear una instancia del convertidor
convertidorMonedas convertidor = new convertidorMonedas();

// Convertir de USD a EUR
Double resultado = convertidor.convertir("USD", "EUR", 100.0);
System.out.println("Resultado: " + resultado);
```

## Requisitos 🛠️

- Java 8 o superior
- Maven

## Instalación y Ejecución 🚀

1. Clona este repositorio:

```bash
git clone <URL_DEL_REPOSITORIO>
```

2. Navega al directorio del proyecto:

```bash
cd convertidordemonedas
```

3. Compila el proyecto usando Maven:

```bash
mvn clean install
```

4. Ejecuta la aplicación:

```bash
java -cp target/classes com.alura.Main
```

## Contribuciones 🤝

¡Las contribuciones son bienvenidas! Si tienes ideas o mejoras, no dudes en abrir un issue o enviar un pull request.

## Licencia 📄

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

---

Hecho con ❤️ por [Luneska Newton].
