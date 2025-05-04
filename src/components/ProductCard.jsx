const ProductCard = ({ product }) => (
  <div className="bg-white rounded-xl shadow-md overflow-hidden hover:shadow-lg transition-shadow duration-300 w-full max-w-sm mx-auto">
    <div className="w-full h-[50px] bg-gray-100 flex justify-center items-center">
      <img
        src={product.imageUrl}
        alt={product.name}
        className="w-[50px] h-[500px] object-cover"
        style={{ width: '220px', height: '220px' }}
        onError={(e) => (e.target.src = "https://via.placeholder.com/50")}
      />
    </div>
    <div className="p-4">
      <h4 className="text-lg font-semibold text-gray-800 truncate">{product.name}</h4>
      <p className="text-sm text-gray-500">{product.brand}</p>
      <p className="text-base font-bold text-indigo-600">${product.price}</p>
      <span className="inline-block mt-2 px-2 py-1 text-xs font-medium bg-gray-100 text-gray-700 rounded">
        {product.category}
      </span>
    </div>
  </div>
);

export default ProductCard;
