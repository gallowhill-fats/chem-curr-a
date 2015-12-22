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

;;; comparatives

(defineType :Comparative (:Thing))
(defineType :GreaterComparative (:Comparative))
(defineType :SmallerComparative (:Comparative))

;;; ILOs
(defineType :ILO (:Act))

;;; naming
(defineType :Name (:Thing))
(defineType :NameableThing (:Thing))

;;; properties and quantities
(defineType :Property (:Thing))
(defineType :PhysicalProperty (:Property))
(defineType :NonPhysicalProperty (:Property))
(defineType :ChemicalProperty (:Property))
(defineType :Quantity (:Thing))

;;; UseOf

(defineType :UseAndCircumstance (:Thing))

;;; type of chemical reaction

(defineType :ReactionType (:Thing))








