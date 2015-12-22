;;; Interrogatory functions

;;; A

(defn all-entities-of-this-kind 
  "Return all the entities in the same class as an entity given its entity name."
  [name]
  (let [name (if (seq? name) (first name) name)]
  (pathsfrom name '(compose  entity-name- ! namable-entity  member- ! class class- ! member))))

(defn all-names-of-this-kind 
  "Return the names of all the members of the same class given the name of a class member."
  [name]
  (pathsfrom name '(compose  entity-name- ! namable-entity  member- ! class class- ! member namable-entity- ! entity-name)))


;;; B

;;; C

;;; D

;;; E

;;; F

;;; G

;;; H

;;; I

;;; J

;;; K

;;; L

;;; M

;;; N

;;; O

;;; P

;;; Q

;;; R

;;; S

(defn state-me 
  "Return the statement of a statable entity given the entity name."
  [name]
  (pathsfrom name '(compose entity-name- ! namable-entity statable-entity- ! statement)))

;;; T

;;; U

;;; V

;;; W

(defn what-does-this-name 
  "Return the entities corresponding to a given entity name,"
  [name]
  (pathsfrom name '(compose  entity-name- ! namable-entity )))

(defn what-is-this
  "Return the class to which an entity belomgs."
  [entity]
  (pathsfrom entity '(compose  entity-name- ! namable-entity  member- ! class namable-class- ! class-name)))

 (defn what-classname-hierarchy 
  "Return the class name hierarchy to which an entity belongs given the entity name."
  [name]
  (pathsfrom name '(compose (compose  entity-name- ! namable-entity  member- ! class  (kstar (compose subclass- ! superclass)) namable-class- ! class-name))))

(defn what-kinds-are-this 
  "Return the class hierarchy to which an entity belongs given the entity name."
  [name]
  (pathsfrom name '(compose  entity-name- ! namable-entity  member- ! class  (kstar (compose subclass- ! superclass)))))

(defn whats-my-definition  
  "Return the definition of a definable entity given its name."
  [name]
  (pathsfrom name '(compose entity-name- ! namable-entity definable-entity- ! definition)))

(defn whats-my-symbol  
  "Return the symbol of a symbolable entity given the entity name."
  [name]
  (pathsfrom name '(compose entity-name- ! namable-entity symboled-entity- ! symbol)))

;;; X

;;; Y

;;; Z
