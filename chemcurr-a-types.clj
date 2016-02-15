;;; cardinality

(defineType :Collection (:Thing))

;;; analysing

(defineType :Analysable (:Thing))

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

(defineType :Change (:Thing))
(defineType :ChemicalChange (:Change))
(defineType :ChemicalReaction (:Thing))
(defineType :RedoxReaction (:ChemicalReaction))
(defineType :HalfReaction (:ChemicalReaction))


;;; chemical equation

(defineType :ChemicalEquation (:Thing))

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

(defineType :ChemicalProperty (:Property))
(defineType :NonPhysicalProperty (:Property))
(defineType :NominalProperty (:Property))
(defineType :PhysicalProperty (:Property))
(defineType :Property (:Thing))
(defineType :Quantity (:DefinableThing))

;;; State

(defineType :State (:Thing))
(defineType :PhysicalState (:State))


;;; UseOf

(defineType :UseAndCircumstance (:Thing))

;;; type of chemical reaction

(defineType :ReactionType (:Thing))

;;; Means

(defineType :Means (:Thing))

;;; Defining

(defineType :DefinableThing (:Thing))

;;; fundamental constants

(defineType :FundamentalConstant (:DefinableThing))

;;; Modifier

(defineType :Modifier (:Thing))

;;; subatomic particle

(defineType :SubatomicParticle (:DefinableThing))

;;; electrochem

(defineType :Electrode (:Thing))
(defineType :ElectrodePotential (:Thing))











