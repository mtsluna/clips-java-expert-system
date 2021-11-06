; archivo facts.clp
(import model.*)

(deftemplate Persona (declare (from-class Persona)))
(deftemplate Viaje (declare (from-class Viaje)))

(defrule esPlazasDelCentro
    (Persona 
            (visitaPrevia ?a&: (eq ?a "No"))
            (edad ?d&: (eq ?d "36-56"))
    )
    (Viaje 
            (presupuesto ?b&: (eq ?b "< 500"))
            (plan ?c&: (eq ?c "Visitar"))
    )
    =>
    (printout t "Plazas del centro" crlf)
)

(defrule esParquesDeSky
    (Viaje 
            (estacion ?estacion&: (eq ?estacion "Invierno"))
            (plan ?plan&: (eq ?plan "Diversion"))
            (presupuesto ?presupuesto&: (eq ?presupuesto "> 1000"))
    )
    =>
    (printout t "Parques de sky" crlf)
)

(defrule esBodega
    (Viaje
        (presupuesto ?presupuesto&: (or (eq ?presupuesto "500-1000") (eq ?presupuesto "> 1000")))
    )
    (Persona 
        (visitaPrevia ?visitaPrevia&: (eq ?visitaPrevia "Si"))
        (grupo ?grupo&: (or (eq ?grupo "Amigos")(eq ?grupo "Pareja")))
    )
    =>
    (printout t "Bodegas" crlf)
)

(defrule esUltimaOpcion
    =>
    (printout t "No hemos podido encontrar una recomendación" crlf)
)