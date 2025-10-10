document.addEventListener('DOMContentLoaded', () => {
    const productCards = document.querySelectorAll('.product-card');
    const orderList = document.getElementById('order-list');
    const totalPriceElement = document.getElementById('total-price');
    const payButton = document.getElementById('pay-button');

    let total = 0;

    // Función para actualizar el total
    const updateTotalPrice = () => {
        totalPriceElement.textContent = `$${total.toFixed(2)}`;
    };

    // Añadir eventos de clic a cada tarjeta de producto
    productCards.forEach(card => {
        card.addEventListener('click', () => {
            // Obtener los datos del producto desde los atributos 'data-'
            const productName = card.getAttribute('data-name');
            const productPrice = parseFloat(card.getAttribute('data-price'));

            // Crear un nuevo elemento para el pedido
            const orderItem = document.createElement('div');
            orderItem.classList.add('order-item');
            orderItem.innerHTML = `
                <span class="order-item-name">${productName}</span>
                <span class="order-item-price">$${productPrice.toFixed(2)}</span>
            `;

            // Añadir el elemento al pedido
            orderList.appendChild(orderItem);

            // Actualizar el total
            total += productPrice;
            updateTotalPrice();
        });
    });

    // Evento para el botón de pago
    payButton.addEventListener('click', () => {
        if (total > 0) {
            alert(`¡Pago realizado por un total de $${total.toFixed(2)}!`);
            // Limpiar el pedido después del pago
            orderList.innerHTML = '';
            total = 0;
            updateTotalPrice();
        } else {
            alert('El carrito está vacío. Añade productos para continuar.');
        }
    });
});