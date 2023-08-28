import axios from "axios"

const API_URL="http://localhost:5000";

class ProductService{
    saveProduct(product){
        return axios.post(API_URL+"/save",product);
    }
    getAllProduct(){
        return axios.get(API_URL+"/");
    }
    getProductById(id){
        return axios.get(API_URL+"/detail/"+id);
    }
    deleteProduct(id){
        return axios.get(API_URL+"/delete/"+id);
    }
    editProduct(product){
        return axios.post(API_URL+"/edit/"+product.id,product);
    }
}

export default new ProductService