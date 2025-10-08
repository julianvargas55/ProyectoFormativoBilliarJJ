function realizarPago() {
    if (pedidoActual.length === 0) {
        alert('El pedido está vacío. Por favor, agregue algún producto.');
        return;
    }

    // 1. Convertir el array de productos a formato JSON (texto que el servidor entiende)
    const datosPedidoJSON = JSON.stringify(pedidoActual);
    
    // 2. Usar 'fetch' para enviar los datos al servidor.
    // NOTA: Debes cambiar '/api/guardar-pedido' a la dirección correcta en tu servidor.
    fetch('/api/guardar-pedido', {
        method: 'POST', // Estamos ENVIANDO datos
        headers: {
            'Content-Type': 'application/json', // Le decimos al servidor que enviamos JSON
            // Si usas Spring Security (Thymeleaf/Java), quizá necesites agregar aquí el token CSRF
        },
        body: datosPedidoJSON 
    })
    .then(response => {
        if (!response.ok) {
            // Si el servidor falla, mostramos error
            throw new Error('El servidor no pudo guardar el pedido.');
        }
        return response.json(); // Leer la respuesta del servidor
    })
    .then(data => {
        // Si todo sale bien
        const total = document.getElementById('total-price').textContent;
        alert(`¡Gracias! El pedido fue guardado.\nTotal: ${total}`);
        
        // Limpiar el carrito después del éxito
        pedidoActual = [];
        actualizarVistaPedido();
    })
    .catch(error => {
        console.error('Error al enviar el pedido:', error);
        alert('Error de comunicación con el servidor. Intente de nuevo.');
    });
}