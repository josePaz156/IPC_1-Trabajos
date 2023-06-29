from flask import Flask, jsonify, request
from flask_cors import CORS
from Administradores import Administrador
from Clientes import Cliente
from Comentarios import Comentario
from Playlist import Play
from Solicitudes import Solicitud
from Peliculas import Pelicula

app = Flask(__name__)
CORS(app)

Admis = []
prueba = []
Clies = []
Cans = []
Coms = []
Plays = []
Sols = []


ContCan = 0 #identificador unico de canciones, incrementara cada vez que se vaya ingresando
ContSol = 0

Admis.append(Administrador('admin', 'admin','admin','admin'))
Clies.append(Cliente('Jose', 'Paz', 'jose156', '1234'))

#=====================================Rutas para Administradores=======================================


#Obtener todos los elemento
@app.route('/Administradores', methods=['GET'])
def rutaAdmi():
    global Admis
    Datos = []
  
    for Admi in Admis:
       
        Dato = {
            'nombre': Admi.getNombre(),
            'apellido': Admi.getApellido(), 
            'usuario': Admi.getNombreusuario(),
            'contrasena': Admi.getContraseña()
            }
        Datos.append(Dato)
    respuesta = jsonify(Datos)
    return(respuesta)



#Agregar elemento
@app.route('/Administradoresa/', methods=['POST']) 
def agregarAdmia():
    global Admis

    nombreP = request.json['nombre']
    apellidoP = request.json['apellido']
    usuarioP = request.json['usuario']
    contrasenaP = request.json['password']
    encontrado = False
    for Admi in Admis:
        if Admi.getNombreusuario() == usuarioP:
             encontrado = True
             break
    if encontrado: #si encontro uno igual, encontrado es verdadero
             return jsonify({
                'usuario': Admi.getNombreusuario(),
                'menssage':'Failed',
                'reason':'El usuario ya esta registrado'
             })
    else: #si no encontro uno igual, encontrado falso
             nuevoa = Administrador(request.json['nombre'],request.json['apellido'],request.json['usuario'],request.json['password'])
             Admis.append(nuevoa)
             return jsonify({
                   'message':'Sucess',
                   'reason':'successfully registered'
             })


#Mostrar un elemento 
@app.route('/Administradores1/<string:nombre>', methods=['GET']) 
def obteneradmi(nombre):
    global Admis
    Datos = []
    for Admi in Admis:  #En admi, vas a recorrer admi   
        if Admi.getNombreusuario() == nombre: #si el los admis registrados son igual al admi mandado 
            Dato = {#vas a crear un dato
                'nombre': Admi.getNombre(),
                'apellido': Admi.getApellido(), 
                'usuario': Admi.getNombreusuario(),
                'contrasena': Admi.getContraseña()
                }
           # Datos.append(Dato)#lo vas a agregar
            break  #se rompe
    respuesta = jsonify(Dato)
    return(respuesta)

#Modificar un elemento 
@app.route('/Administradores2/<string:nombre>', methods=['PUT']) 
def Actualizaradmi(nombre):
    global Admis
    for i in range(len(Admis)): 
        if nombre==Admis[i].getNombreusuario(): #si el los admis registrados son igual al admi mandado 
            Admis[i].setNombre(request.json['nombre'])
            Admis[i].setApellido(request.json['apellido'])
            Admis[i].setNombreusuario(request.json['usuario'])
            Admis[i].setContraseña(request.json['password'])
            break  #se rompe
    return jsonify({'message':'Se actualizo con exito'})

#Eliminar un elemento 
@app.route('/Administradores3/<string:nombre>', methods=['DELETE']) 
def Eliminaradmi(nombre):
    global Admis
    for i in range(len(Admis)): 
        if nombre==Admis[i].getNombreusuario(): #si el los admis registrados son igual al admi mandado 
            del Admis[i]
            break  #se rompe
    return jsonify({'message':'Se elimino el dato con exito'})

#=====================================Rutas para Clientes=======================================

#Obtener todos los elemento
@app.route('/Clientes', methods=['GET'])
def rutaClie():
    global Clies
    Datos2 = []
    # el objeto admi va a recorrer cada posicion de mi lista(Admis)
    for Clie in Clies:
        #construyendo un objeto de tipo dato que tiene la estructura de un Json
        Dato2 = {
            'nombre': Clie.getNombre(),
            'apellido': Clie.getApellido(), 
            'usuario': Clie.getNombreusuario(),
            'contrasena': Clie.getContraseña()
            }
        Datos2.append(Dato2)#añade cada dato a los datos
    respuesta2 = jsonify(Datos2)#va a darle una estructura json a mi arreglo de datos 
    return(respuesta2)

#Agregar elemento
@app.route('/Clientes/', methods=['POST']) 
def agregarClie():
    global Clies

    nombreP = request.json['nombre']
    apellidoP = request.json['apellido']
    usuarioP = request.json['usuario']
    contrasenaP = request.json['contrasena']
    encontrado = False
    for Clie in Clies:
        if Clie.getNombreusuario() == usuarioP:
             encontrado = True
             break
    if encontrado: #si encontro uno igual, encontrado es verdadero
             return jsonify({
                'usuario': Clie.getNombreusuario(),
                'menssage':'Failed',
                'reason':'El usuario ya esta registrado'
             })
    else: #si no encontro uno igual, encontrado falso
             nuevo2 = Cliente(request.json['nombre'],request.json['apellido'],request.json['usuario'],request.json['contrasena'])
             Clies.append(nuevo2)
             return jsonify({
                   'message':'Sucess',
                   'reason':'successfully registered'
             })

#Mostrar un elemento 
@app.route('/Clientes1/<string:nombre>', methods=['GET']) 
def obtenerClie(nombre):
    global Clies
    Datos2 = []
    for Clie in Clies:  #En admi, vas a recorrer admi   
        if Clie.getNombreusuario() == nombre: #si el los admis registrados son igual al admi mandado 
            Dato2 = {#vas a crear un dato
                'nombre': Clie.getNombre(),
                'apellido': Clie.getApellido(), 
                'usuario': Clie.getNombreusuario(),
                'contrasena': Clie.getContraseña()
                }
           # Datos.append(Dato)#lo vas a agregar
            break  #se rompe
    respuesta2 = jsonify(Dato2)
    return(respuesta2)

#Modificar un elemento 
@app.route('/Clientes2/<string:nombre>', methods=['PUT']) 
def ActualizarClien(nombre):
    global Clies
    for i in range(len(Clies)): 
        if nombre==Clies[i].getNombreusuario(): #si el los admis registrados son igual al admi mandado 
            Clies[i].setNombre(request.json['nombre'])
            Clies[i].setApellido(request.json['apellido'])
            Clies[i].setNombreusuario(request.json['usuario'])
            Clies[i].setContraseña(request.json['password'])
            break  #se rompe
    return jsonify({'message':'Se actualizo con exito'})

#Eliminar un elemento 
@app.route('/Clientes3/<string:nombre>', methods=['DELETE']) 
def EliminarClie(nombre):
    global Clies
    for i in range(len(Clies)): 
        if nombre==Clies[i].getNombreusuario(): #si el los admis registrados son igual al admi mandado 
            del Clies[i]
            break  #se rompe
    return jsonify({'message':'Se elimino el dato con exito'})



#=====================================Peliculas=======================================

#Obtener todos los elemento

def CargarPeliculas(datos):
    peliculas = []
    texto = datos['texto']
    
    # separacion del texto en lineas
    lineas = texto.split("\n")
    
    cont = 0
    for linea in lineas:
        # para omitir linea de encabezado
        if(cont==0):
            cont+=1
            continue
        
        #dividir la linea en columnas
        columnas = linea.split(";")
        
        if(len(columnas) != 6):
            continue
        
        # crear nueva pelicula
        nuevaPelicula = Pelicula(columnas[0], columnas[1], columnas[2], columnas[3], columnas[4], columnas[5])
        peliculas.append(nuevaPelicula.toDict())
        
    return {'data': peliculas, 'status': 200}

def GetPelicula(datos, peliculas):
    nombrePelicula = datos['nombrePelicula']
    pelicula = {}
    status = 400

    for i in range(len(peliculas)):
        movie = peliculas[i]

        if(movie['nombre'] == nombrePelicula):
            # para saber la posicion de la pelicula a actualizar
            pelicula = movie
            pelicula['posicionArreglo'] = i
            status = 200
        
    return {'data': pelicula, 'status': status}

def EditarPelicula(datos, peliculas):
    posicionArreglo = int(datos['posicionArreglo'])

    if(posicionArreglo != None):
        nuevaPelicula = Pelicula(datos['nombre'], datos['genero'], datos['clasificacion'],
                          datos['anio'], datos['duracion'], datos['link'])

        peliculas[posicionArreglo] = nuevaPelicula.toDict()
        return {'data':peliculas, 'status': 200}
    return {'data':peliculas, 'status': 400}

def EliminarPelicula(datos, peliculas):
    # https://www.geeksforgeeks.org/python-removing-dictionary-from-list-of-dictionaries/
    nombrePelicula = datos['nombrePelicula']
    nuevoPeliculas = []
    status = 400

    for i in range(len(peliculas)):
        movie = peliculas[i]

        # si la pelicula coincide con la que se quiere eliminar
        if(movie['nombre'] == nombrePelicula):
            status = 200
            # salta una iteración
            continue
        
        nuevoPeliculas.append(movie)
        
    return {'data': nuevoPeliculas, 'status': status}

@app.route('/cargarPeliculas', methods=['POST'])
def cargarPeliculas():
    respuesta = CargarPeliculas(request.json)
    global peliculas
    peliculas = respuesta['data']
    return respuesta

@app.route('/getPeliculas', methods=['GET'])
def getPeliculas():
    respuesta = {'data': peliculas, 'status': 200}
    return respuesta

@app.route('/getPelicula', methods=['POST'])
def getPelicula():
    respuesta = GetPelicula(request.json, peliculas)
    return respuesta

@app.route('/editarPelicula', methods=['POST'])
def editarPelicula():
    global peliculas
    respuesta = EditarPelicula(request.json, peliculas)
    peliculas = respuesta['data']
    return {'data':'OK', 'status': respuesta['status']}

@app.route('/eliminarPelicula', methods=['POST'])
def eliminarPelicula():
    global peliculas
    respuesta = EliminarPelicula(request.json, peliculas)
    peliculas = respuesta['data']
    return {'data':'OK', 'status': respuesta['status']}


#=====================================LOGIN=======================================
    
@app.route('/Login2/', methods=['POST']) 
def Login2():
    global Clies
    global Admis

    usuarioL = request.json['usuario']
    contasenaL = request.json['password']
    
    confirma=False
    #if confirma==False:
    if confirma==False:
        for Clie in Clies:
            if Clie.getNombreusuario() == usuarioL and Clie.getContraseña() == contasenaL:  
                DatoL = {
                    'message':'Success1',
                    'usuario': Clie.getNombreusuario()
                    }
                confirma=True
                break
            else:
                DatoL = {
                   'message':'Failed',
                   'usuario': ''
                   }
    #elif confirma==False:
    if confirma==False:#no funciona con elif por que si el primero se ejecuta, no lo valua, y entonces se va con qeu las credenciales no son correctas
        for Admi in Admis:
            if Admi.getNombreusuario() == usuarioL and Admi.getContraseña() == contasenaL:       
                DatoL = {
                    'message':'Success2',
                    'usuario': Admi.getNombreusuario()
                    }
                confirma=True
                break
            else:
                DatoL = {
                   'message':'Failed',
                   'usuario': ''
                    }
    respuesta = jsonify(DatoL)
    return(respuesta)        

#Recuperar contraseña
@app.route('/Recuperar/', methods=['POST']) 
def RecuperarContraCliente():
    global Clies

    usuarioP = request.json['usuario']
    
    encontrado = False
    for Clie in Clies:
        if Clie.getNombreusuario() == usuarioP:
             encontrado = True
             break
    if encontrado: #si encontro uno igual, encontrado es verdadero
             return jsonify({
                'usuario': Clie.getNombreusuario(),
                'password': Clie.getContraseña(),
                'pip':'True',
                'reason':'Se encontro el usuario'
             })
    else: #si no encontro uno igual, encontrado falso
             
             return jsonify({
                   'usuario': "",
                   'password': "f",
                   'message':'False',
                   'reason':'No se encontro el usuario'
             })
#=====================================Comentarios======================================


#Obtener todos los elemento
@app.route('/Comentarios', methods=['GET'])
def rutaComen():
    global Coms
    Datos4 = []
    for Com in Coms:
        Dato4 = {
            'nombre': Com.getNombre(),
            'id': Com.getId(),
            'persona': Com.getPersona()
            }
        Datos4.append(Dato4)#añade cada dato a los datos
    respuesta = jsonify(Datos4)#va a darle una estructura json a mi arreglo de datos 
    return(respuesta)


#Agregar elemento
@app.route('/Comentariosa/', methods=['POST']) 
def agregarComen():
    global Coms
    nombreP = request.json['nombre']
    identifi = request.json['id']
    person = request.json['persona']
    nuevoc = Comentario(nombreP, identifi, person)
    Coms.append(nuevoc)
    return jsonify({
                'message':'Sucess',
                'reason':'successfully registered'
                })


#Mostrar elementos restringidos
@app.route('/Comentariosm/<string:iden>', methods=['GET']) 
def obtenerComen(iden):
    global Coms
    Datos4 = []
    for Com in Coms:  
        if Com.getId()  == iden:  
            Dato4 = { 
                'nombre': Com.getNombre(),
                'id': Com.getId(),
                'persona': Com.getPersona()
                }
            Datos4.append(Dato4)
    respuesta4 = jsonify(Datos4)
    return(respuesta4)

#=====================================PlayList======================================


#Obtener todos los elemento
@app.route('/Play', methods=['GET'])
def rutaPlay():
    global Plays
    Datos5 = []
    for Pla in Plays:
        Dato5 = {
            'link': Pla.getLink(),
            'id': Pla.getId(),
            'persona': Pla.getPersona(),
            'imagen': Pla.getImagen()
            }
        Datos5.append(Dato5)#añade cada dato a los datos
    respuesta = jsonify(Datos5)#va a darle una estructura json a mi arreglo de datos 
    return(respuesta)


#Agregar elemento
@app.route('/Playa/', methods=['POST']) 
def agregarPlay():
    global Plays
    link = request.json['link']
    identifi = request.json['id']
    person = request.json['persona']
    ima = request.json['imagen']
    nuevop = Play(link, identifi, person, ima)
    Plays.append(nuevop)
    return jsonify({
                'message':'Sucess',
                'reason':'successfully registered'
                })

#Mostrar elementos restringidos
@app.route('/Playm/<string:iden>', methods=['GET']) 
def obtenerPlay(iden):
    global Plays
    Datos5 = []
    for Pla in Plays:  
        if Pla.getPersona()  == iden:  
            Dato5 = { 
                'link':Pla.getLink(),
                'id': Pla.getId(),
                'persona': Pla.getPersona(),
                'imagen': Pla.getImagen()
                }
            Datos5.append(Dato5)
    respuesta5 = jsonify(Datos5)
    return(respuesta5)
#==========================================Solicitues=================================================
#Obtener todos los elemento
@app.route('/Solicitues', methods=['GET'])
def rutaSol():
    global Sols
    Datos6 = []
    # el objeto Can va a recorrer cada posicion de mi lista(Cans)
    for Sol in Sols:
        #construyendo un objeto de tipo dato que tiene la estructura de un Json
        Dato6 = {
            'Identificador': Sol.getIdv(),
            'Nombre': Sol.getNombrev(),
            'Artista': Sol.getArtistav(),
            'Album': Sol.getAlbumv(),
            'Imagen': Sol.getImagenv(),
            'Fecha': Sol.getFechav(),
            'LinkS': Sol.getLinkspotiv(),
            'LinkY': Sol.getLinkyoutuv()
            }
        Datos6.append(Dato6)#añade cada dato a los datos
    respuesta6 = jsonify(Datos6)#va a darle una estructura json a mi arreglo de datos 
    return(respuesta6)

#Agregar elemento
@app.route('/Solicitudesa/', methods=['POST']) 
def agregarSol():
    global Sols, ContSol
    id = ContSol#variable que lleva el identificador de las cancionesp
    nombrev = request.json['nombre']
    artistav = request.json['artista']
    albumv = request.json['album']
    fechav = request.json['fecha']
    imagenv = request.json['imagen']
    linksv = request.json['spotify']
    linkyv = request.json['youtube']

    nuevo6 = Solicitud(ContSol, nombrev, artistav, albumv, imagenv, fechav, linksv, linkyv)
    Sols.append(nuevo6)
    ContSol += 1
    return jsonify({
            'messagge':'Success',
            'reason':'Se agregó la Solicitud'
            })


#Mostrar un elemento 
@app.route('/Solicitues1/<string:nombre>', methods=['GET']) 
def obtenerSol(nombre):
    f = int(nombre)#pase la cadena de texto a tipo entero para poder ocmpararlo con el identificador
    global Sols
    Datos6 = []
    for Sol in Sols:  
        if Sol.getIdv() == f: #si el los cans registrados son igual al can mandado 
            Dato6 = {
                 'Identificador': Sol.getIdv(),
                 'Nombre': Sol.getNombrev(),
                 'Artista': Sol.getArtistav(),
                 'Album': Sol.getAlbumv(),
                 'Imagen': Sol.getImagenv(),
                 'Fecha': Sol.getFechav(),
                 'LinkS': Sol.getLinkspotiv(),
                 'LinkY': Sol.getLinkyoutuv()
                 }
           # Datos.append(Dato)#lo vas a agregar
            break  #se rompe
    respuesta6 = jsonify(Dato6)
    return(respuesta6)


#Eliminar un elemento 
@app.route('/Solicitudese/<string:nombre>', methods=['DELETE']) 
def EliminarSol(nombre):
    f6 = int(nombre)
    global Sols
    for i in range(len(Sols)): 
        if f6==Sols[i].getIdv(): #si el los admis registrados son igual al admi mandado 
            del Sols[i]
            break  #se rompe
    return jsonify({'message':'Se elimino el dato con exito'})


#DE ultimo
if __name__ == "__main__":
    app.run(port=5000, debug=True)




