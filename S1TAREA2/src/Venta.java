import java.util.ArrayList;

public class Venta {
	private ArrayList<Producto> itemsVenta;
	private double precioTotal;
	
	public Venta() {
		itemsVenta = new ArrayList<Producto>();
		precioTotal = 0; 
		}
	
	public double calcularTotal() throws VentaVaciaException  {
		if (itemsVenta.size()==0)  {
			throw new VentaVaciaException("Para hacer una venta hay que ingresar productos");
		} 
			 return sumaItems(); 
		}
	
	public double sumaItems() throws ArrayIndexOutOfBoundsException{
		for (int i=0; i<itemsVenta.size()+1; i++) {// itemsVenta.size()+1 para provocar el error
			if (i>=itemsVenta.size()) {
				throw new ArrayIndexOutOfBoundsException();
			}
				System.out.println(itemsVenta.get(i).getNombre()+"  € "+itemsVenta.get(i).getPrecio());
				precioTotal += itemsVenta.get(i).getPrecio();
		}
			return precioTotal;
	}
	public void setProducto (String nombreProducto, double precioProducto) {
		Producto producto= new Producto(nombreProducto,precioProducto);
		itemsVenta.add(producto);
	}
}
