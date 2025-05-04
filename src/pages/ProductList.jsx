import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { Link } from 'react-router-dom';
import ProductCard from '../components/ProductCard';
import { toast } from 'react-toastify';

function ProductList() {
  const [products, setProducts] = useState([]);
  const [search, setSearch] = useState('');

  useEffect(() => {
    fetchProducts();
  }, [search]);

  const fetchProducts = async () => {
    try {
      const res = await axios.get(`http://localhost:8082/productapi/products`, {
        params: search ? { search } : {}
      });
      setProducts(res.data);
    } catch (err) {
      toast.error("Failed to load products");
    }
  };

  return (
    <div>
      <h2>Search Products</h2>
      <input type="text" value={search} onChange={(e) => setSearch(e.target.value)} placeholder="Search..." />
      <div style={{ display: 'grid', gridTemplateColumns: 'repeat(3, 1fr)', gap: '1rem' }}>
        {products.map((product) => (
          <Link key={product.id} to={`/product/${product.id}`}>
            <ProductCard product={product} />
          </Link>
        ))}
      </div>
    </div>
  );
}

export default ProductList;
