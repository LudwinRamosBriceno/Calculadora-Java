package Operaciones;

public class Operaciones {
  
  double resultado = 0;
  
  public double cos (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.cos(angulo_en_radianes);
      return resultado;
  }
  public double sin (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.sin(angulo_en_radianes);
      return resultado;
  }
  public double tan (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.tan(angulo_en_radianes);
      return resultado;
  }
  public double arccos (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.acos(angulo_en_radianes);
      return resultado;
  }
  public double arcsin (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.asin(angulo_en_radianes);
      return resultado;
  }
  public double arctan (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.atan(angulo_en_radianes);
      return resultado;
  }
  public double cosh (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.cosh(angulo_en_radianes);
      return resultado;
  }
  public double sinh (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.sinh(angulo_en_radianes);
      return resultado;
  }
  public double tanh (double angulo_en_grados){
      double angulo_en_radianes = Math.toRadians(angulo_en_grados);
      resultado = Math.tanh(angulo_en_radianes);
      return resultado;
  }
