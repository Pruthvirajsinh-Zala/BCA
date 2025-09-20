<?php

class Product {
    private static int $nextSKU = 1000;

    public function __construct(
        public string $name,
        public float $price,
        public string $category,
        public int $sku = 0
    ) {
        if ($this->sku === 0) {
            $this->sku = self::$nextSKU++;
        }
    }

    public function displayProduct(): void {
        echo "Name: {$this->name}<br>";
        echo "Price: \${$this->price}<br>";
        echo "Category: {$this->category}<br>";
        echo "SKU: {$this->sku}<br>";
    }

    public function __clone() {
        $this->sku = self::$nextSKU++;
        $this->name .= " (Cloned)";
    }
}

$originalProduct = new Product('Smartphone', 800.00, 'Electronics');
echo "<h2>Original Product</h2>";
$originalProduct->displayProduct();

$clonedProduct = clone $originalProduct;
echo "<h2>Cloned Product</h2>";
$clonedProduct->displayProduct();

?>