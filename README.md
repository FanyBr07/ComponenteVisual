# Captcha (componente visual)

## Componente de Captcha personalizado para Java Swing

Este proyecto implementa un componente visual de Captcha en Java, usando `JPanel`, que puede integrarse fácilmente en formularios de inicio de sesión (login). Su función es mostrar una imagen distorsionada con un código aleatorio (ya sea predeterminado o estilizado), lo cual ayuda a validar que el usuario no es un bot.

---

## `CaptchaPanel.java`

### `generarCaptcha()`
Genera un nuevo código aleatorio y redibuja el componente con una imagen distorsionada. Esto es importante para que cada cadena no sea repetitiva y sea lo suficientemente difícil de leer.

### `generarCodigoAleatorio()`
Dependiendo del tipo seleccionado (letras, números o mixto), genera una cadena segura sin caracteres ambiguos como `O`, `0` y `1`, ya que suelen confundirse.

### `generarImagenDistorsionada(String texto)`
Crea una imagen `BufferedImage` con:
- Gradientes de fondo  
- Líneas de interferencia  
- Rotaciones aleatorias de caracteres  
- Opacidad configurable  
- Manejo de color pixelado

---

## Propiedades configurables

- `setTipo(TipoCaptcha tipo)` – letras, números o mixto:  
  ![Num](https://ibb.co/JWNX49wS/numero.png)  
  ![Let](https://i.ibb.co/G4LCzpzT/letras.png)  
  ![Mix](https://i.ibb.co/RGz8KB02/mixto.png)

- `setOpacidad(int opacidad)` – nivel de opacidad del texto (0 a 100):  
  ![OpMayor](https://i.ibb.co/3Y0mfX1m/mayor-Opacidad.png)  
  ![OpMenor](https://i.ibb.co/BV15jnGK/menor-Opacidad.png)

- `setAnchoCaptcha(int ancho)` – ancho del panel:  
  ![Ancho](https://i.ibb.co/VWGBStB/ancho.png)

- `setAltoCaptcha(int alto)` – alto del panel:  
  ![Alto](https://i.ibb.co/MxnSRMG7/alto.png)

- `setLongitud(int longitud)` – cantidad de caracteres del código (4 a 8):  
  ![Long](https://i.ibb.co/wrWJLWxn/longitud.png)

- Vista general de propiedades:  
  ![Prop](https://imgbb.com/][img]https://i.ibb.co/TD1Zhdb8/propiedades.pn)

---

## `CaptchaPanelBeanInfo.java`

Esta clase permite configurar fácilmente las propiedades del `CaptchaPanel` desde el editor gráfico de NetBeans. Define qué atributos deben ser tratados como JavaBeans, lo cual hace que el componente sea reutilizable y configurable visualmente sin necesidad de escribir código manual.

Propiedades editables:
- `tipo`
- `opacidad`
- `anchoCaptcha`
- `altoCaptcha`
- `longitud`

---

## `Login.java`

Se creó un login común y funcional que utiliza el `CaptchaPanel` como medida de seguridad.

### Funcionamiento:
- ✅ Valida correo, contraseña y CAPTCHA
- ❌ Muestra mensaje si el CAPTCHA no es correcto  
  ![Incorrecto](https://i.ibb.co/67nfxNvM/incorrecto.png)
- 🔄 Refresca el CAPTCHA de forma dinámica
- ✅ Muestra acceso concedido si los datos son correctos  
  ![Correcto](https://i.ibb.co/gLCq4Wn6/correcto.png)

---
# Video Youtube Componente Visual Java Swing 🧩

Este repositorio contiene un componente personalizado de CAPTCHA para formularios en Java 

🎥 Mira cómo usarlo paso a paso:  
[![Ver en YouTube](https://img.shields.io/badge/Ver_en-YouTube-red?style=for-the-badge&logo=youtube)](https://youtu.be/8A79e1IdhPc)


## Instrucciones de uso
1. Clona o descarga este repositorio.
2. Abre el proyecto en **NetBeans**.
3. Primero, compila tu clase CaptchaPanel.java pero este de manera jar (Clean and build project o shift + 11)
4. Seguido de eso en tu pañeta dale click derecho y creas una nuerva categoria
5. Luego, da clic derecho en la paleta de componentes, elige ‘Agregar desde archivo Jar...’, selecciona tu .jar o clase compilada, y añade CaptchaPanel a una categoría personalizada (de la misma manera en el que lo nombraste)
6. Ejecuta la clase `Login.java` para ver el formulario con CAPTCHA
7. Ahora, abre tu formulario de tipo JFrame, y simplemente arrastra el componente CaptchaPanel desde la paleta hacia el panel donde recomiendo que a tu variable la llames captcha para asi probarlo dentro del login que te incluimos
8. Usa el botón **Validar** para comprobar el CAPTCHA y luego ingresar.
9. Puedes cambiar las propiedades del componente desde el editor visual o por código:

```java
captcha.setTipo(CaptchaPanel.TipoCaptcha.mixto);
captcha.setLongitud(6);
captcha.setOpacidad(80);


---
## Creditos
Bustamante Rios Flor Estephany
Olmos Reyes Ittay Ayelen
