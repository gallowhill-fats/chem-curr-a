;;; number
(defineType :Number (:Thing))
(defineType :Real (:Number))
(defineType :Float (:Real))
(defineType :Rational (:Real))
(defineType :Integer (:Rational))

;;; chemical types
(defineType :ChemicalReferent (:Thing))
(defineType :ChemicalEntity (:ChemicalReferent))
(defineType :ChemicalSubstance (:ChemicalReferent))
(defineType :PureChemicalSubstance (:ChemicalSubstance))
(defineType :ChemicalSpecies (:PureChemicalSubstance))
(defineType :Element (:ChemicalSpecies))
(defineType :ChemicalEntity (:ChemicalReferent))
(defineType :AtomicChemicalEntity (:ChemicalEntity))
(defineType :MolecularChemicalEntity (:ChemicalEntity))

;;; chemical reaction

(defineType :ChemicalReaction (:Thing))

;;; ILOs
(defineType :ILO (:Act))

;;; naming
(defineType :Name (:Thing))
(defineType :NameableThing (:Thing))

;;; properties and quantities
(defineType :Quantity (:Thing))






