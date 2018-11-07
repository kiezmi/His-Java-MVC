# Api_Administracion_De_un_Hospital(HIS)

Aplicacion creada para administrar un sistema hospitalario.
Tiene varios puntos que se iran expandiendo:
-Creacion de roles (Admin, paciente, doctor y tecnico)
-Conexion a una base de datos montada en docker con MySQL 5.7

Principalmente un paciente puede:
-Ver su historial medico, donde tendra todas las visitas realizadas con el dia hora y medico que le atendio.
-Pedir cita (Proximamente)
-Modificar sus datos

Un doctor puede:
-Ver listados de pacientes
-Ver ficha de un paciente en concreto
-Ver el historial de un paciente
-Añadir entradas en el historial del paciente
-Modificar datos de un paciente
-Modificar sus datos

Un tecnico puede:
-Ver listados de doctores
-Ver listados de pacientes
-Ver ficha de un paciente
-Ver ficha de un doctor
-Modificar datos de un doctor
-Modificar sus datos
-Crear nuevos usuarios con roles menos Admin

Admin puede:
-Crear todos los usuarios
-Modificar todos los usuarios