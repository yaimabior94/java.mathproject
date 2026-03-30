# Compile the Java files
Write-Host "Compiling..." -ForegroundColor Cyan
javac App.java Math.java

if ($LASTEXITCODE -eq 0) {
    Write-Host "Compilation successful!" -ForegroundColor Green
    # Run the App class
    java App
    # Optional cleanup
    # Remove-Item *.class
} else {
    Write-Host "Compilation failed." -ForegroundColor Red
}
