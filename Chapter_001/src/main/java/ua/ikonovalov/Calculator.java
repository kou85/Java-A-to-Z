package calc;

/**
 * Реализует операции калькулятора: сложение, вычитание, умножение, деление. 
 * @author Ivan Konovalov
 * @date 11.11.2016
 */
 
 public class Calculate{
 
	private double result;
	double first;
	double second;
	
	
	/**
	 * Операция сложение.
	 * @param first, second - аргументы
	*/
	public void add(first, second){
	
		this.result = first + second;
	
	}
	
	/**
	 * Операция вычитания.
	*/ 
	 
	 
	public void substract(first, second){
		 
		 this.result = first - second;
		 
	}
	 
	/**
	 * Операция деления.
	*/
	 
	public void div(first, second){
		 
		 this.result = first / second;
	}
	
	/**
	 * Операция умножения.
	*/
	
	public void multiple(first, second){
		
		this.result = first * second;
		
	}
	
	/**
	 * Возвращение результата.
	 *@return result - результат.
	*/
	
	public double getResult(){
		return this.result;
	}
	
	
	
	
 
 
 
 }

