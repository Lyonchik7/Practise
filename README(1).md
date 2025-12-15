# 1. Перейдите в папку с исходным кодом
cd src/main/java

# 2. Скомпилируйте все Java-файлы
javac *.java

# 3. Запустите программу
java Main

# Второй вариант
javac src/main/java/*.java && java -cp src/main/java Main
