import React, { useEffect, useState } from 'react';
import { useParams, useNavigate } from 'react-router-dom';
import axios from 'axios';
import { toast } from 'react-toastify';

function ProductDetails() {
  const { id } = useParams();
  const navigate = useNavigate();
  const [product, setProduct] = useState(null);

  useEffect(() => {
    axios.get(`/products/${id}`)
      .then(res => setProduct(res.data))
      .catch(() => toast.error("Failed to load product"));
  }, [id]);

  if (!product) return <p>Loading...</p>;

  return (
    <div>
      <button onClick={() => navigate(-1)}>Back to Search</button>
      <img src={product.imageUrl} alt={product.name} style={{ width: '300px' }} />
      <h2>{product.name}</h2>
      <p>{product.brand}</p>
      <p>{product.price}</p>
      <p>{product.category}</p>
      <p>{product.description}</p>
    </div>
  );
}

export default ProductDetails;
