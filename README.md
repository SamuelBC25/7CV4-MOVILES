# 7CV4-MOVILES

# Integrantes:
* **Buendia Cedillo Irvin Samuel**

* **Rosario Cruz Josue Benjamin**

* **Grupo: 7CV4**

Práctica 1: Instalación y Funcionamiento de los Entornos Móviles
Android Studio
 ![alt text](Screenshots/image-2.png)

GitHub Desktop
 ![alt text](Screenshots/image-1.png)

 ![alt text](Screenshots/image.png)

 ## 1. Descripción de las Activities (Sistema Solar)
Se diseñó una aplicación Android con una navegación jerárquica de 4 niveles:

* [**GalaxiaActivity:** Menú principal y punto de entrada al proyecto creativo.
* **SistemaSolarActivity:** Segundo nivel que muestra la disposición del sistema.
* **PlanetasActivity:** Tercer nivel con el listado interactivo de cuerpos celestes.
* **LunasActivity:** Nivel final que detalla los satélites naturales.

---

## 2. Transiciones y Ciclo de Vida
Se utilizaron **Intents explícitos** para la comunicación entre las clases de Kotlin[cite: 10, 11]. 
* **Transiciones:** Se aplicó `overridePendingTransition` para lograr una navegación fluida y creativa entre los niveles.
* **Ciclo de Vida:** Se gestionó el estado de las Activities mediante métodos como `onCreate` para inicialización y `onResume/onPause` para el flujo de la app.

---

## 3. Instrucciones de Ejecución
1. Clonar el repositorio: `git clone https://github.com/SamuelBC25/7CV4-MOVILES.git`.
2. Abrir en Android Studio con JDK Amazon Corretto[cite: 23].
3. Ejecutar `flutter doctor` (si aplica para los componentes de Flutter instalados) o simplemente correr el proyecto en el emulador.

---

## 4. Evidencias
![Menú Principal](Screenshots/galaxia.png)
![Navegación Planetas a Lunas](Screenshots/lunas.png)