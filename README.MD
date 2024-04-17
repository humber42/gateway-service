# Gateway Service

### Instrucciones para inicializar este servicio:

- Ejecutar este servicio luego de arrancar el <b>naming-service</b> y <b>cloud-config-server</b>
- Abrir una terminal en la raíz del servicio y ejecutar la siguiente instrucción
 ``mvn spring-boot:run``

### Rutas que expone:
 * Este servicio es el gateway y expone las rutas a los microservicios:
   1. `/address` Corresponde a waste-manager-address
   2. `/manager` Corresponde a waste-manager
 * Para poder utilizar estas rutas que se exponen debe encender los servicios correspondientes primero

### Guía:
* Para probar algunos servicios puede utilizar los CURLS que se exponen a continuación:
  * Obtener el waste-manager con id = 1 ``curl --request GET \
    --url http://localhost:80/manager/1``
  * Obtener el waste-manager-address con id = 2 ``curl --request GET \
    --url http://localhost:80/address/1``
  * Insertar un waste-manager-address ``curl --request POST \
    --url http://localhost:80/address \
    --header 'Content-Type: application/json' \
    --data '{
    "direccion":"CAMPO IGLESIA, 95, 22283, CASBAS DE HUESCA(HUESCA)"
    }'``
  * Insertar un waste-manager ``curl --request POST \
    --url http://localhost:80/manager/create \
    --header 'Content-Type: application/json' \
    --data '{
    "nombre":"ROSALIA SALGADO JURADO",
    "nif":"55566272C",
    "managerAddress":{
    "id":1
    },
    "wasteCenterAuthorizationList":[
    {
    "authorizationNumber":"SDASHUU566699"
    }
    ]
    }'``