;;; naming classes
;;; hasEntityName
(defineSlot namable-entity :type :Entity)
(defineSlot entity-name :type :Name)
(defineSlot hasChemicalName :type :Thing)
(defineSlot hasIupacName :type :Thing)
(defineSlot hasIupacNameSubstitutive :type :Thing)
(defineSlot hasIupacNameAdditive :type :Thing)
(defineSlot hasAcceptableCommonName :type :Thing)
(defineSlot hasPreferredIupacName :type :Thing)
(defineSlot hasGeneralIupacname :type :Thing)
(defineSlot hasRetainedIupacName :type :Thing)
(defineSlot hasAtomName :type :Thing)
(defineSlot hasElementName :type :Thing)
(defineSlot hasMoleculeName :type :Thing)
(defineSlot hasSubstanceName :type :Thing)
(defineSlot hasSystematicName :type :Thing)
(defineSlot hasOtherName :type :Thing)
(defineSlot hasName :type :Thing)
(defineSlot hasEntityName :type :Thing)
;;; hasClassName
(defineSlot namable-class :type :Category)
(defineSlot class-name :type :Name)
;;; referent hierarchies
(defineSlot pure-chemical-substance-name :type :Thing)

(defineSlot subclass :type Category :negadjust reduce
            :path (compose ! subclass (kstar (compose superclass- ! subclass)))
            :docstring "Subcategories of some category/ies.")
(defineSlot superclass :type Category :negadjust reduce
            :path (compose ! superclass (kstar (compose subclass- ! superclass)))
            :docstring "Supercategories of some category/ies.")
