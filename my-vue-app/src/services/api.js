import axios from 'axios';
import keycloak from '@/auth/auth-keycloak.js';

const api = axios.create()
api.defaults.baseURL = 'http://localhost:9090/'
export async function fetchData() {
    const token = keycloak.token
    const response = await api.get('/reports', {
        headers: {
            'Content-Type': 'application/json',
            Authorization: `Bearer ${token}`,
        },
    });
    return response.data;
}
