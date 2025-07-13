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
  ![Num](https://ibb.co/JWNX49wS)  
  ![Let](https://ibb.co/Q3RYyQyd)  
  ![Mix](https://ibb.co/SDRSgdnN)

- `setOpacidad(int opacidad)` – nivel de opacidad del texto (0 a 100):  
  ![OpMayor](https://ibb.co/Kz9xNZ6x)  
  ![OpMenor](https://ibb.co/HDJfYhCp)

- `setAnchoCaptcha(int ancho)` – ancho del panel:  
  ![Ancho](https://ibb.co/DDFKCtKD)

- `setAltoCaptcha(int alto)` – alto del panel:  
  ![Alto](https://ibb.co/v61qJZQk)

- `setLongitud(int longitud)` – cantidad de caracteres del código (4 a 8):  
  ![Long](https://ibb.co/LhtQPt2T)

- Vista general de propiedades:  
  ![Prop](https://ibb.co/ympDs7Yy)

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
  ![Incorrecto](https://ibb.co/4nm5GJsq)
- 🔄 Refresca el CAPTCHA de forma dinámica
- ✅ Muestra acceso concedido si los datos son correctos  
  ![Correcto](https://ibb.co/MxLwB1X9)

---

## Instrucciones de uso

1. Clona o descarga este repositorio.
2. Abre el proyecto en **NetBeans**.
3. Ejecuta la clase `Login.java` para ver el formulario con CAPTCHA.
4. Usa el botón **Validar** para comprobar el CAPTCHA y luego ingresar.
5. Puedes cambiar las propiedades del componente desde el editor visual o por código:

```java
captcha.setTipo(CaptchaPanel.TipoCaptcha.mixto);
captcha.setLongitud(6);
captcha.setOpacidad(80);

---
## Creditos
Bustamante Rios Flor Estephany
Olmos Reyes Ittay Ayelen
