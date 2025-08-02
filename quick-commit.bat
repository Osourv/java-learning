@echo off
setlocal enabledelayedexpansion
echo Adding all files...
git add .
if !errorlevel! neq 0 (
    echo Error: Failed to add files. Make sure you're in a Git repository.
    pause
    exit /b 1
)

echo.
set /p "message=Enter commit message: "

if "!message!"=="" (
    echo Error: Commit message cannot be empty.
    pause
    exit /b 1
)

echo.
echo Committing changes...
git commit -m "!message!"
if !errorlevel! equ 1 (
    echo No changes to commit. Working tree is clean.
    echo.
    echo Done! No changes were needed.
    pause
    exit /b 0
) else if !errorlevel! neq 0 (
    echo Error: Failed to commit changes.
    pause
    exit /b 1
)

echo.
echo Pushing to GitHub...
git push origin main
if !errorlevel! neq 0 (
    echo Error: Failed to push to GitHub.
    pause
    exit /b 1
)

echo.
echo Done! All changes committed and pushed.
pause
