def ingresar_temperaturas():
    temperaturas = []
    for dia in range(1, 8):
        temp = float(input(f"Ingrese la temperatura del día {dia}: "))
        temperaturas.append(temp)
    return temperaturas

def calcular_promedio(temperaturas):
    return sum(temperaturas) / len(temperaturas)

def main():
    print("=== Promedio semanal del clima ===")
    temperaturas = ingresar_temperaturas()
    promedio = calcular_promedio(temperaturas)
    print(f"El promedio semanal es: {promedio:.2f}°C")

if __name__ == "__main__":
    main()