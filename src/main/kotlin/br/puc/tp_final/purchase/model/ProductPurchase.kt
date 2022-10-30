package br.puc.tp_final.purchase.model

import javax.persistence.*

@Entity
@Table(name = "tb_product_purchase")
data class ProductPurchase (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productPurchaseId")
    val productPurchaseId: Long? = null,

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "product", referencedColumnName = "productId", foreignKey = ForeignKey(name = "fk_product_purchase_product"))
    val product: Product,

    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase", referencedColumnName = "purchaseId", foreignKey = ForeignKey(name = "fk_product_purchase_purchase"))
    val purchase: Purchase,

    @Column(name = "productQuantity")
    var productQuantity: Long
)